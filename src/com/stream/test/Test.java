package com.stream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demo {
    public int x;
    public String name;
    private final Address address;

    /**
     *
     * @param x
     * @param name
     * @param address
     */
    public Demo(int x,String name, Address address) {
        this.x = x;
        this.name = name;
        this.address = address;
    }

    public int getX() {
        return x;
    }

    public Address getAddress() {
        return address;
    }
}


class Address {
    private final String city;
    private final String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCityAndState() {
        return city + " " + state;
    }
}

public class Test {

    public void myMethod() {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        Stream<Integer> stream = list1.stream();
//        stream.filter(x -> x%2 == 0).map(x -> x*3).forEach(System.out::println);

        List<Demo> list = new ArrayList<>() {{
            add(new Demo(12, "Ashish", new Address("Patna", "Bihar")));
            add(new Demo(14,"Ranjan", new Address("Muzaffarpur", "Bihar")));
            add(new Demo(38,"Animesh", new Address("Bhopal", "Madhya Pradesh")));
        }};

        Map<String, String> map = list.stream().map(Demo::getAddress).collect(Collectors.toMap(Address::getCity, Address::getState));
        System.out.println(map);
//        list.stream().map(Demo::getAddress).map(Address::getCityAndState).forEach(System.out::println);
//        list.stream().map(Demo::getX).forEach(System.out::println);
//        list.stream().map(demo -> demo.name).forEach(System.out::println);
    }

    public static void main(String[] args) {

        Bank bank = (a, b) -> 2 * a + b;
        int ans = bank.print(4,7);
        System.out.println(ans);

        Test obj = new Test();
        obj.myMethod();
    }

    public void printName(String name) {
        System.out.println("Name is " + name);
    }

    public void printAge(int x) {
        System.out.println("Ashish " + x);
    }

}
