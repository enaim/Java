package messenger;
 
 
import java.io.IOException;  
import java.net.DatagramPacket;  
import java.net.DatagramSocket; 
import java.net.InetAddress;
import java.net.SocketTimeoutException;

/**
 *
 * @author Naim Elias
 */
public class User {
    private static int My_Port = 6023;
    private static int Friend_Port = 6024;

    public static void main(String[] args) throws IOException {  
        
        String message = "";
        String receivedMessage = "";
        DatagramSocket datagramSocket = new DatagramSocket(My_Port);  
        
        InputClass input = new InputClass();
        Thread inputThread = new Thread(input);
        
        inputThread.start();
        
        while(true)
        {
            message = input.getMassage();
            input.Clear();
            if(message.length() > 0)
            {
                DatagramPacket sendpacket = new DatagramPacket(message.getBytes(), message.getBytes().length, 
                InetAddress.getByName("localhost"), Friend_Port);  

                datagramSocket.send(sendpacket);  
                message = "";
            }
                
            byte [] buff = new byte[100];
            DatagramPacket datagramPacket = new DatagramPacket(buff, 100);          
            
            datagramSocket.setSoTimeout(1);
            try{
                datagramSocket.receive(datagramPacket);
            }catch(SocketTimeoutException e){
                continue;
            }
            
            receivedMessage = new String(datagramPacket.getData(), "UTF-8");
            System.out.println("Received1: " + receivedMessage);
        }
    }      
}
