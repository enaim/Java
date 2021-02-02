package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {
    public static void main(String args[])
    {
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(6);
        
        System.out.println(arrayList);
        for(int it : arrayList)
            System.out.println(it);
        System.out.println("");
        System.out.println("Index 1 -> " + arrayList.get(1));
        arrayList.set(0, 50);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
