
package clientsideapp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientSideApp1 {

    
    public static void main(String[] args)  {

        try {
            //attempting to connect to a server listening on this localport
            Socket s= new Socket("localhost",2024);
            
            PrintWriter pw= new PrintWriter(s.getOutputStream(),true);
            pw.println("Hey server ");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
             System.out.println("Client says "+br.readLine());
            
        } catch (IOException ex) {
            Logger.getLogger(ClientSideApp1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
