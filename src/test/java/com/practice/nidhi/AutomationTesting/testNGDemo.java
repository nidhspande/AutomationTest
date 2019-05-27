package com.practice.nidhi.AutomationTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNGDemo {


    @BeforeSuite
    public static void Before() {
        System.out.println("This is before");
    }


    @AfterSuite
    public static void After() {
        System.out.println("This is After");
    }


    @Test
    public void a1() {
        System.out.println("This is test a1");
    }


    @Test
    public void a2() {
        System.out.println("This is test a2");
    }

    @Test
    public void a3() {
        System.out.println("This is test a3");
    }

    @Test
    public void a4() {
        System.out.println("This is test a4");
    }

}
