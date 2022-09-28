import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args)
    {
        try {

            String s = "Abdul";

            ServerSocket ss = new ServerSocket(6666);

            // establishes connection
            Socket soc = ss.accept();

            // invoking input stream
            DataInputStream dis  = new DataInputStream(soc.getInputStream());

            String str = dis.readUTF();

            System.out.println("message= " + str);

            // closing socket
//            ss.close();

        } // for catching Exception in run time
        catch (Exception e) {
            System.out.println(e);
        }
    }
}