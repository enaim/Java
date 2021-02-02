/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;


import java.io.IOException;  
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;  
import java.net.DatagramSocket; 
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naim Elias
 */
public class UDPSocket implements Runnable{
    
    private IReceivedPacketCallBack receivedPacketCallBack = null;
    private DatagramSocket socked = null;
    private boolean bIsRunning = true;
    
    UDPSocket(IReceivedPacketCallBack callBack, int Port) throws SocketException{
        receivedPacketCallBack = callBack;        
        socked = new DatagramSocket(Port);  
        bIsRunning = true;
    }
    
    public void StopThread()
    {
        bIsRunning = false;
    }
    
    public void SendData(String message, String SendAddress, int SendPort)
    {        
        try {  
            DatagramPacket sendpacket = new DatagramPacket(message.getBytes(), message.getBytes().length, 
                    InetAddress.getByName(SendAddress), SendPort);
            try {  
                socked.send(sendpacket);
            } catch (IOException ex) {
                Logger.getLogger(UDPSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPSocket.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    @Override
    public void run() {
        
        byte []buff = new byte[1024];
        while(bIsRunning)
        {
            Arrays.fill(buff, (byte)0);
            DatagramPacket datagramPacket = new DatagramPacket(buff, 1024);          
            
            try {
                socked.receive(datagramPacket);
            } catch (IOException ex) {
                Logger.getLogger(UDPSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try {
                String receivedMessage = new String(datagramPacket.getData(), "UTF-8");
                receivedPacketCallBack.ProcessReceivedData(receivedMessage);                
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(UDPSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        
}
