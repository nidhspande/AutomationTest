package com.practice.nidhi.JavaExamples;

public class functions {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String a = "abcdef";
        String b = "xyz1234";
        String c = "abcxy";
        if (a.length() > c.length() && a.length() < b.length())
            System.out.println("pass");
        else
            System.out.println("Fail");
        if (a.contentEquals(b) == false && a.contentEquals(c) == false)
            System.out.println("Pass");
        else
            System.out.println("fail");
        if (c.equalsIgnoreCase(a) == true)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        if (a.contains("cd") == true && a.contains("xy") != true)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        if (b.toUpperCase().contains("z") == true && b.toUpperCase().contains("z") == false)
            System.out.print("Pass");
        else
            System.out.println("fail");
    }

}
