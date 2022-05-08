package com.stream.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatDemo {

    public static void main(String[] args) {

        System.out.println("1 line has been added to test branch");

        List<Integer> l1 = Arrays.asList(2,3,4);
        List<Integer> l2 = Arrays.asList(5,6,7);
        List<Integer> l3 = Arrays.asList(8,9,10);

        List<List<Integer>> list = Arrays.asList(l1,l2,l3);

        List<Integer> stream1 = list.stream().flatMap(tempList -> tempList.stream().map(n -> n*2)).collect(Collectors.toList());
        System.out.println(stream1);

        List<Integer> a1 = Arrays.asList(12,13,14);
        List<Integer> a2 = Arrays.asList(15,16,17);
        List<Integer> a3 = Arrays.asList(18,19,20);
        List<List<Integer>> list1 = Arrays.asList(a1,a2,a3);

        List<List<List<Integer>>> listTemp = Arrays.asList(list,list1);
        System.out.println(listTemp);

        List<List<Integer>> temp = listTemp.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(temp);

        List<Integer> temp1 = listTemp.stream().flatMap(Collection::stream).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(temp1);
        System.out.println(temp1);
        System.out.println(temp1);
    }
}
