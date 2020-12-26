package com.syntax.class1;

import org.testng.annotations.*;
import org.testng.annotations.Test;
//* - will import all library's
public class PreAndPostConditionAnnotation {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class annotation");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @Test
    public void testMethod(){
        System.out.println("I am a test method");
    }

    @Test
    public void testMethod2(){
        System.out.println("I am a second method");
    }

    @Test
    public void testMethod3(){
        System.out.println("I am a third test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }



}

//* - import all methods;
//Preconditions are not a test methods(beforemethod, aftermethod);