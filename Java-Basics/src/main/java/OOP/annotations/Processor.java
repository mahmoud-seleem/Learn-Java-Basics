package OOP.annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@SupportedAnnotationTypes("Demo")
public class Processor extends AbstractProcessor {

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Demo.class)) {
            if (element.getKind() == ElementKind.METHOD) {
                ExecutableElement methodElement = (ExecutableElement) element;

                // Check if the method is not abstract
                if (methodElement.getModifiers().contains(Modifier.ABSTRACT)) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                            "@LogMethod cannot be applied to abstract methods", element);
                } else {
                    generateLoggingCode(methodElement);
                }
            }
        }
        return true;
    }

    private void generateLoggingCode(ExecutableElement methodElement) {
        try {
            String methodName = methodElement.getSimpleName().toString();
            String className = ((TypeElement) methodElement.getEnclosingElement()).getQualifiedName().toString();

            // Create a new source file for logging
            String loggerClassName = className + "Logger";
            PrintWriter writer = new PrintWriter(processingEnv.getFiler().createSourceFile(loggerClassName).openWriter());

            // Generate logging code
            writer.println("import java.util.logging.Logger;");
            writer.println("public class " + loggerClassName + " {");
            writer.println("    private static final Logger logger = Logger.getLogger(\"" + className + "\");");
            writer.println("    public static void log" + methodName + "Entry() {");
            writer.println("        logger.info(\"Entering method: " + methodName + "\");");
            writer.println("    }");
            writer.println("    public static void log" + methodName + "Exit() {");
            writer.println("        logger.info(\"Exiting method: " + methodName + "\");");
            writer.println("    }");
            writer.println("}");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
