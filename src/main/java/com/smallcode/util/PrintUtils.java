package com.smallcode.util;

import java.io.Serializable;

public class PrintUtils {


    public static <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void printLine() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
