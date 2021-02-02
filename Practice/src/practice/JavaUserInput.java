/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Naim Elias
 */
public class JavaUserInput {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        System.out.println(number);
        
        double point = input.nextDouble();
        System.out.println(point);
        
        long longNumber = input.nextLong();
        System.out.println(longNumber);
        
        input.nextLine();
        String str = input.nextLine();
        System.out.println(str);
        
        boolean flag = input.nextBoolean();
        System.out.println(flag);
    }
}
