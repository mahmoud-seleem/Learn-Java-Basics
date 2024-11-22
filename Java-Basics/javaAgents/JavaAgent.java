import java.lang.instrument.Instrumentation;
public class JavaAgent {
    public static void premain(
        String agentArgs, Instrumentation instrumentation){
            System.out.println("hi from the java agent ❤️");
    }
}