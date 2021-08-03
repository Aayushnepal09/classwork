package com;

import java.util.Scanner;
public class adding {
    public static void main (String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b = scan.nextInt();
        int c = a+b;

        System.out.println(c);
    }
}
