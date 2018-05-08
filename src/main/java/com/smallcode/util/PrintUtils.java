package com.smallcode.util;

public class PrintUtils {


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();
    }
}
