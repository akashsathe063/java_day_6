package com.day6.perfect;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int number=num;
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
           if (num%i==0) {

               sum = sum + i;
           }

        }
        System.out.println(sum);
        if(sum==number)
        {
            System.out.println("This number is perfect number");
        }
        else{
            System.out.println("This number is not perfect");
        }
    }
}
