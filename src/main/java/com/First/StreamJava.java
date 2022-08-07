package com.First;
import java.util.*;
import java.util.stream.*;

public class StreamJava {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        List<Integer> evenNo=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNo);
    }

}
