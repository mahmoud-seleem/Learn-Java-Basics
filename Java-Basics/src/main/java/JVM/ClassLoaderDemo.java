package JVM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClassLoaderDemo extends ClassLoader{

    public static void main(String[] args) {
        
    }
    
    private String basePath;

    public ClassLoaderDemo(String basePath){
        this.basePath = basePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String filePath = basePath + File.separator + name.replace('.', File.separatorChar) + ".class";

            // Read the class bytecode
            byte[] classBytes = downloadClassBytes(filePath);

            // Define the class using the downloaded bytecode
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Failed to load class " + name, e);
        }    
    }

    private byte[] downloadClassBytes(String filePath) throws IOException{
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[inputStream.available()];
            int bytesRead = inputStream.read(buffer);
            if (bytesRead != buffer.length) {
                throw new IOException("Could not read the complete class file");
            }else{
                return buffer;
            }
        }   
    }
}

