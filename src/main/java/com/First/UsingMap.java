package com.First;

import java.util.stream.*;
import java.util.*;
public class UsingMap {
    public static void main(String[]args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);
        List<Integer>marks=l.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(marks);

    }

}
