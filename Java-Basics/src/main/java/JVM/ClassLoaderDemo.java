package JVM;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;


public class ClassLoaderDemo extends ClassLoader{

    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String serverUrl = "http://localhost:8000/classes/test";
        ClassLoaderDemo demo = new ClassLoaderDemo(serverUrl);
        Class<?> clzz = demo.loadClass("Foo");
        System.out.println(clzz);
        Method[] methods =  clzz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
    
    private String basePath;
    private String baseUrl;
//
//    public ClassLoaderDemo(String basePath){
//        this.basePath = basePath;
//    }
    public ClassLoaderDemo(String baseUrl){
        this.baseUrl = baseUrl;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
//            String filePath = basePath + File.separator + name.replace('.', File.separatorChar) + ".class";
            String urlPath = baseUrl + "/" + name.replace('.', '/') + ".class";
            // Read the class bytecode
            byte[] classBytes = downloadClassBytesFromInternet(urlPath);

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
    private byte[] downloadClassBytesFromInternet(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (InputStream inputStream = connection.getInputStream();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        } finally {
            connection.disconnect();
        }
    }
}

