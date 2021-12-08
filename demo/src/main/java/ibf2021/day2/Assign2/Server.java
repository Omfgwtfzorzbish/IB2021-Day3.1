package ibf2021.day2.Assign2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
   public static void main(String[] args) throws IOException
{
    System.out.println("Listening at port 3000...");
    ServerSocket serverSocket = new ServerSocket(3000);
    Socket socket = serverSocket.accept();
    
    try(InputStream is = socket.getInputStream()){
        //is = socket.getInputStream()
        /*BufferedInputStream bis = new BufferedInputStream(is);
        DataInputStream dis = new DataInputStream(bis); */

        DataInputStream dis = new DataInputStream(new BufferedInputStream(is));
        String string = dis.readUTF();
        System.out.println("Message: " + string);
    }
    socket.close();
    serverSocket.close();
}
}
