package com.izyumka.lesson5;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int rnumber = 1 + (int) (Math.random() * 10);
        int[] arr = new int[rnumber];

        for (int i = 0; i < arr.length; i++) {
            rnumber = 1 + (int) (Math.random() * 10);
            arr[i] = rnumber;
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(twoSum(arr, 9)));


    }
}