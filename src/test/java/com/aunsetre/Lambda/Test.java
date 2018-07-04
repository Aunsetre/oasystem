package com.aunsetre.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Aunsetre
 * @DATE: 2018-06-15 11:32:25
 */
public class Test {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("peter","luna","ruby","java");
        Collections.sort(names,(a,b)->b.compareTo(a));
        for (String string : names) {
            System.out.println(string);

        }
    }
}
