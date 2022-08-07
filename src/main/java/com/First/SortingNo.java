package com.First;

import java.util.*;
import java.util.stream.Collectors;

public class SortingNo {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(40);
        l.add(90);
        l.add(30);
        System.out.println(l);
        List<Integer>sortList=l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);

    }

}
