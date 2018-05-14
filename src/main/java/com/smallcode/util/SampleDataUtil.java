package com.smallcode.util;

import java.util.*;

/**
 * @author niele
 * @date 2018/5/13
 */
public class SampleDataUtil {

    public static Integer[] makeArray(int len) {
        Integer solutionArr[] = new Integer[len];
        List list=new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            list.add(i+1);
        }
        Collections.shuffle(list);
        list.toArray(solutionArr);
        return solutionArr;
    }
}
