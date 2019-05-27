package com.practice.nidhi.AutomationTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Sample {

    @BeforeClass
    public static void Before() {
        System.out.println("This is before");
    }

    @AfterClass
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
    
    @Test
    public void a5() {
        System.out.println("This is test a5");
    }
}
