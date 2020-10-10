/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Naim Elias
 */
public class OOP {
    
    public static void main(String[] args) {
           Base a  = new Base();
           a.print();
           
           Extended1 a1 = new Extended1();
           a1.print();
           
           Base b  = new Extended1();
           b.print();                     
    }
}
