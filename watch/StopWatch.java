package com.day6.watch;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.println("pause execution");
       int n = scanner.nextInt();
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        System.out.println("Elapsed time " + (double)timeElapsed/1000+" second");
    }
}
