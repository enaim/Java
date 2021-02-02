/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

class Base{
    public void print()
    {
        System.out.println("From Base");
    }
}

class Sub extends Base{
    @Override
    public void print()
    {
        System.out.println("From Sub Class");
    }
    public void check()
    {
        System.out.println("Okay");
    }
}


public class Inheritence {
    public static void main(String[] args)
    {
        Base base = new Base();
        base.print();
        
        Sub sub = new Sub();
        sub.print();
        sub.check();
        
        Base obj = new Sub();
        obj.print();
    }
}
