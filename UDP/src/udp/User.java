/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package udp;
 
 
import java.io.IOException;  
import java.net.DatagramPacket;  
import java.net.DatagramSocket; 
import java.net.InetAddress;

/**
 *
 * @author Naim Elias
 */
public class User {
    private static int My_Port = 6023;
    private static int Friend_Port = 6024;

    public static void main(String[] args) throws IOException {  
        DatagramSocket datagramSocket = new DatagramSocket(My_Port);  
        Utils.Sleep(5000);
        
        String message = "Hi";
        
        DatagramPacket sendpacket = new DatagramPacket(message.getBytes(), message.getBytes().length, 
                InetAddress.getByName("localhost"), Friend_Port);  
        
//        DatagramPacket sendpacket = new DatagramPacket(message.getBytes(), message.getBytes().length, 
//                InetAddress.getByName(192.168.1.132), Friend_Port);  
                
        datagramSocket.send(sendpacket);  
        System.out.println("Pecket Sent.");
        
        byte [] buff = new byte[100];
        
        DatagramPacket datagramPacket = new DatagramPacket(buff, 100);  
                  
        
        
        System.out.println("Waiting for packet....");
        datagramSocket.receive(datagramPacket);
                
        String receivedMessage = new String(datagramPacket.getData(), "UTF-8");
        
        System.out.println("Received: " + receivedMessage);
    }      
}
