package com.loggar.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCopyJava10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdfasd");
        list.add("sdfasdfasdfasdf");
        list.add("qwekjlqkeekekekekeek");

        List<String> copy = List.copyOf(list);

        System.out.println(copy);
    }
}
