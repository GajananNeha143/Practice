package com.First;

import java.util.*;
import java.util.stream.Collectors;

public class StringSorting {

    public static void main(String[] args) {


        ArrayList<String> s = new ArrayList<String>();
        s.add("Kavya");
        s.add("Gajanan");
        s.add("Neha");
        System.out.println(s);
        List<String> l = s.stream().sorted().collect(Collectors.toList());
        System.out.println(l);
    }
}