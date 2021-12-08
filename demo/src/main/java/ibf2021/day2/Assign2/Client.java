package ibf2021.day2.Assign2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    
    public static void main(String[] args) 
            throws UnknownHostException, IOException{
            {
        Socket socket = new Socket("192.168.2.6", 3000);  //port is 3000 server is listening to 3000
            
        try (OutputStream os = socket.getOutputStream()){
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);

            
            dos.writeUTF("Hello World!");
            dos.flush();
        }
        socket.close();
        
            }


    }
}
