package com.learn;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("a");
        for (String s : v) {
            System.out.println(s);
        }
    }
}
