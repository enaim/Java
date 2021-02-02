/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.logging.Level;
import java.util.logging.Logger;

class Sleep{
    public static void sleep(int times)
    {
        try {
            Thread.sleep(times);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


class Foo implements Runnable{
    String name;
    boolean flag;
    public Foo(String str)
    {
        name = str;
        flag = true;
    }
    public void Stop()
    {
        flag = false;
    }
    @Override
    public void run()
    {
        while(flag)
        {
            System.out.println(name + " Thread Running");
        }
    }
}


public class JavaThread{
    public static void main(String[] args)
    {
        Foo foo1 = new Foo("First");
        Thread thread1 = new Thread(foo1);
        
        Foo foo2 = new Foo("Second");
        Thread thread2 = new Thread(foo2);
        
        thread1.start();
        thread2.start();
        
        Sleep.sleep(1);
        
        foo1.Stop();
        foo2.Stop();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("End of Threads");
    }
}
