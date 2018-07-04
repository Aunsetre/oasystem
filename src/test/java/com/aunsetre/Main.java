package com.aunsetre;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Aunsetre
 * @DATE: 2018-06-15 10:56:28
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names,( a,  b) -> b.compareTo(a));
    }
}
