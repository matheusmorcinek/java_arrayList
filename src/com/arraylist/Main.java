package com.arraylist;

public class Main {

    public static void main(String[] args) {

        ArrayListOfInteger list = new ArrayListOfInteger();

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add(10);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(35);
        list.add(23);

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println();

        list.remove(35);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println();

        list.add(10);
        list.add(1);
        list.add(6);
        list.add(17);
        list.add(35);
        list.add(24);
        list.add(55);
        list.add(43);

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println();

        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println();


    }
}
