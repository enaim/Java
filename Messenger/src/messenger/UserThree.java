/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.net.SocketException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naim Elias
 */
public class UserThree implements IReceivedPacketCallBack{
    
    @Override
    public void ProcessReceivedData(String message) {
        System.out.println("Message: "+ message);
    }

    public UserThree() {
        
    }
    
    public void Process()
    {
        try {
            UDPSocket udpSocket = new UDPSocket(this, 6024);
            Thread thread = new Thread(udpSocket);
            thread.start();
            
            Scanner sc = new Scanner(System.in);
            
            while(sc.hasNext())
            {
                udpSocket.SendData(sc.nextLine(), "localhost", 6023);
            }                        
            
        } catch (SocketException ex) {
            Logger.getLogger(UserThree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
    
    
    public static void main(String[] args) {
        new UserThree().Process();
    }
    
}
