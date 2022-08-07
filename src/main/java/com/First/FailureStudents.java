package com.First;

import java.util.*;
import java.util.stream.Collectors;


public class FailureStudents {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(20);
        l.add(40);
        l.add(65);
        l.add(80);
        l.add(55);
        System.out.println(l);
        List<Integer>failStud=l.stream().filter(i->i<35).collect(Collectors.toList());
        System.out.println(failStud);
    }
}
