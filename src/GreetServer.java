import java.io.*;
import java.net.*;
//public class MyClient {
//    public static void main(String[] args)
//    {
//        try {
//
//            // initializing Socket
//            Socket soc = new Socket("localhost", 6666);
//
//            DataOutputStream d = new DataOutputStream(
//                    soc.getOutputStream());
//
//            // message to display
//            d.writeUTF("Hello My Name is  Abdul");
//
//            d.flush();
//
//            // closing DataOutputStream
////            d.close();
//
//            // closing socket
////            soc.close();
//        }
//
//        // to initialize Exception in run time
//        catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if ("hello server".equals(greeting)) {
            out.println("hello client");
        }
        else {
            out.println("unrecognised greeting");
        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) throws IOException {
        GreetServer server=new GreetServer();
        server.start(6666);
    }
}