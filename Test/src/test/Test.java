/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naim Elias
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bismillahir Rahmanir Rahim");
        PrintThread first = new PrintThread("First");
        PrintThread second = new PrintThread("Second");
        
        Thread thread = new Thread(first );
        Thread thread2 = new Thread(second);        
        
        System.out.println("First Running....");
        thread.start();
                
        System.out.println("Second Running ....");
        thread2.start();
        
        Utils.Sleep(2000);
        first.Stop();
        second.Stop();
        
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
        System.out.println("****************** END ***********************");                
    }
    
}
