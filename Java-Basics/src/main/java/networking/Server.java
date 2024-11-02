package networking;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Starting server...");
        try (ServerSocket serverSocket = new ServerSocket(12345)){
            while (true){
                Socket connectionSocket = serverSocket.accept();
                OutputStream outputStream = connectionSocket.getOutputStream();
                System.out.println("Client connected");
//                PrintWriter writer = new PrintWriter(outputStream, true);
//                writer.println("Hello from Java Server!");
                outputStream.write("Hello from my Server".getBytes());
                outputStream.flush();
//                Thread.sleep(5000l);
                connectionSocket.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
