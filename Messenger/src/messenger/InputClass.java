/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.util.Scanner;

/**
 *
 * @author Naim Elias
 */
public class InputClass implements Runnable{
    public volatile String massage="";
    public void run()
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            massage = input.nextLine();
            Utils.Sleep(5);
        }
    }
    public String getMassage()
    {
        return massage;
    }
    public void Clear()
    {
        massage = "";
    }
}
