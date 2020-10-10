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
public class PrintThread implements Runnable{
    boolean bIsRunning;
    String Name;
    
    public PrintThread(String name) {
        bIsRunning = true;
        Name = name;
    }
    
    
    public void Stop(){
        bIsRunning = false;
    }

    @Override
    public void run() {
        
        int iCounter = 1; 
        
        while(bIsRunning){
            System.out.println(Name + " " + iCounter);
            
            Utils.Sleep(100);
            
            iCounter++;
        }   
                
        System.out.println("----->  End of Thread : "+ Name);
    }            
}
