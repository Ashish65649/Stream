package com.stream.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(5,7,1,3,9,5,6);
//        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list1);
//        System.out.println(list2);

//        List<String> list1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list1);
//        System.out.println(list2);

//        Set<String> set = new HashSet<>(list);
//        boolean a = set.stream().anyMatch(value -> value.startsWith("Z"));
//        System.out.println(a);

        List<String> list = Arrays.asList("Ashish" , "Ranjan" , "John");
        Stream<String> stream = list.stream();
        List<String> list1 = Arrays.asList("Cena" ,"Gaurav", "David", "Apple");
        Stream<String> stream1 = list1.stream();
        List<String> list2 = Stream.concat(stream, stream1).collect(Collectors.toList());
        System.out.println(list2);
        // This is change made in second branch
        // This is second line before merging
        // This is third line added in second - branch
    }
}
