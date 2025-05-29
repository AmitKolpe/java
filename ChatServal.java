import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            Thread readThread = new Thread(() -> {
                String clientMsg;
                try {
                    while ((clientMsg = input.readLine()) != null) {
                        System.out.println("Client: " + clientMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            });

            readThread.start();

            String serverMsg;
            while ((serverMsg = console.readLine()) != null) {
                output.println(serverMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
