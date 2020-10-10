/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Naim Elias
 */
public class InterfaceExample {
    public static void main(String[] args) 
    {
        ArrayList<Traffic> trafficList = new ArrayList<Traffic>();
        
        trafficList.add(new Bus());
        trafficList.add(new SpeedBoat());
        
        for(Traffic tr: trafficList){
            tr.Start();            
        }
    }
}
