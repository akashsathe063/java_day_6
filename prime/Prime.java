package com.day6.prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num;
     int temp=0;

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num<=1)
        {
            System.out.println("this is not prime number");
        }
       else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    temp = temp + 1;
                }
            }
            if(temp==0){
                System.out.println("Number is  prime: "+num);
            }
            else{
                System.out.println("Number is not prime number");
            }
        }

    }
}
