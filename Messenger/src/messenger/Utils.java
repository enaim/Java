/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naim Elias
 */
public class Utils {
    
    public static void Sleep(int times)
    {       
        try {
            Thread.sleep(times);
        } catch (InterruptedException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
