package com.smallcode.util;

import java.util.Random;

/**
 * @author niele
 * @date 2018/5/30
 */
public class RandomUtil {


    public static int rand(int min, int max) {
        Random r = new Random();
        return Math.abs(r.nextInt() % (max - min)) + min;
    }

    public static void main(String[] args) {

        System.out.println(rand(-3,0));
    }
}
