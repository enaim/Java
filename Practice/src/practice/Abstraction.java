/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

abstract class AbstractClass{
    public abstract void print();
    public void check()
    {
        System.out.println("Okay");
    }
}

class InheritAbstractClass extends AbstractClass{
    public void print(){
        System.out.println("Override");
    }
}

public class Abstraction {
    public static void main(String[] args)
    {
        InheritAbstractClass sub = new InheritAbstractClass();
        sub.print();
        sub.check();
    }
}
