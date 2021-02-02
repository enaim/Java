/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;

interface InterfaceClass{
    public void print();
}

class A implements InterfaceClass{
    public void print()
    {
        System.out.println("Class A");
    }
}

class B implements InterfaceClass{
    public void print()
    {
        System.out.println("Class B");
    }
}


public interface Interface {
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        a.print();
        b.print();
        System.out.println("");
        ArrayList<InterfaceClass> arr = new ArrayList<InterfaceClass>();
        arr.add(new A());
        arr.add(new B());
        
        for(InterfaceClass it: arr)
        {
            it.print();
        }
    }
}
