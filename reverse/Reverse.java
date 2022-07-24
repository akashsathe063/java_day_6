package com.day6.reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num;
        int rem;
        int rev=0;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}
