package com.driver;

public class Main {

    public static void main (String args[])
    {
        RWOnly raw = new RWOnly("polu");
        raw.setName("jaggy");
        String s = raw.getName();
        System.out.println(s);
    }
}