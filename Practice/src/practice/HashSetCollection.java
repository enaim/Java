/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashSet;

/**
 *
 * @author Naim Elias
 */
public class HashSetCollection {
    public static void main(String args[])
    {
        HashSet<Integer>set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.contains(20));
        System.out.println(set.size());
    }
}
