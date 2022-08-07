package com.First;

import java.util.*;
import java.util.stream.Collectors;

public class DesSortNo {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<Integer>();
    l.add(30);
    l.add(10);
    l.add(50);
    l.add(16);
    l.add(80);
    l.add(89);
    System.out.println(l);
        List<Integer>AssOrder=l.stream().sorted().collect(Collectors.toList());
    List<Integer> desOrder=l.stream().sorted((i1,i2)->-(i1.compareTo(i2))).collect(Collectors.toList());
    Integer i=l.stream().min((i1,i2)->(i1.compareTo(i2))).get();
    System.out.println(desOrder);
    System.out.println(AssOrder);
    System.out.println(i);
    }
}
