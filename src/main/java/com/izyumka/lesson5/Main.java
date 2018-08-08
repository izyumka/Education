package com.izyumka.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//
//        if (a < 3) {
//            System.out.println("Quiz");
//        } else if (b < 3) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println("Quiz Buzz");
//        }

//        int[] arr = {4,3,2};

//        int[] arr2 = new int [5];

//        for (int i =0; i<=5; i++){
//            System.out.println(i);
//        }

//        for(int i = 1; i<=10; i++){
//            for(int j = 1; j<=10; j++){
//                System.out.print(i*j+" ");
//            }
//            System.out.println();
//        }

        int[] arr = new int[10];
        int j = 0;
        for (int i = 0; i < arr.length * 2; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}