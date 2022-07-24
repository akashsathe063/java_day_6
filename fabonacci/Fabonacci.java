package com.day6.fabonacci;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
            int a=-1;
            int b=1;
            int c;
            int num;
            System.out.println("Enter a number");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            for(int i=1;i<=num;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }


}
