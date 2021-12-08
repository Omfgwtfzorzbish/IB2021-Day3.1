package ibf2021.day2.Assign2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Clientb {
    public static void main(String[] args) throws IOException
    {
        
    
    Socket socket = new Socket("10.244.60.234", 3000);  //port is 3000 server is listening to 3000
            
        try (OutputStream os = socket.getOutputStream()){
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dos = new DataOutputStream(bos);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String msg=" ";
            while(!msg.equals("exit"))
            {
            msg = br.readLine();
            dos.writeUTF(msg);
            dos.flush();
            }
        }
        socket.close();
}
}