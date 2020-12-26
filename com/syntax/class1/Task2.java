package com.syntax.class1;

import org.testng.annotations.*;

public class Task2 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before Class method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @Test
    public void test1(){
        System.out.println("I am test 1");
    }

    @Test
    public void test2(){
        System.out.println("I am test 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after Class method");
    }

}
