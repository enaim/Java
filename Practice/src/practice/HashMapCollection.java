/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;

/**
 *
 * @author Naim Elias
 */
public class HashMapCollection {
    public static void main(String args[])
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"AA");
        map.put(3,"AB");
        map.put(5,"AA@");
        for(int it: map.keySet())
            System.out.println(it);
        System.out.println("");
        for(String it: map.values())
            System.out.println(it);
        System.out.println("");
        System.out.println(map.get(5));
    }
}
