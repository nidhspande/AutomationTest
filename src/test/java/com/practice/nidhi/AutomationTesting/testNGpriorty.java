package com.practice.nidhi.AutomationTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNGpriorty {


    @BeforeSuite 
    public static void Before() {
        System.out.println("This is before");
    }


    @AfterSuite
    public static void After() {
        System.out.println("This is After");
    }


    @Test (priority=3)
    public void a1() {
        System.out.println("This is test a1");
    }


    @Test (priority=1)
    public void a2() {
        System.out.println("This is test a2");
    }

    @Test (priority=2)
    public void a3() {
        System.out.println("This is test a3");
    }

    @Test (priority=5)
    public void a4() {
        System.out.println("This is test a4");
    }

}
