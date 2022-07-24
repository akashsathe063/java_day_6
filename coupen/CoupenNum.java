package com.day6.coupen;

import java.util.Scanner;

public class CoupenNum {
    static int coupen;
    static int output=0;
    public static void main(String[] args) {
        System.out.println("Generate a Coupen ");
        Scanner sc=new Scanner(System.in);
        coupen=sc.nextInt();
     int [] arr=new int[coupen];
     int i=0;
     while(coupen>i){
         int temp=RandumFun();
         //System.out.println(temp);
         output++;
         if(i==0){
             arr[i]=temp;
             i++;
         }
          else{
              boolean check=false;
               for(int j=0;j<i;j++){
                   if(arr[j]==temp){
                      check=true;
                   }
               }
               if(check==false){
                   arr[i]=temp;
                   i++;
               }
         }
     }
        System.out.println(""+output);


    }
    public static int RandumFun(){
        int CheckRandum=(int)Math.floor(Math.random()*coupen);
        return CheckRandum;

    }
}
