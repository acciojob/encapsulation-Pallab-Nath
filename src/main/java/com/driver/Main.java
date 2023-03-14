package com.driver;

import java.lang.String;
public class Main {

    public static void main (String args[])
    {
        RWOnly raw = new RWOnly();
        raw.setName("polu");
        String s = raw.getName();
        System.out.println(s);
    }
}