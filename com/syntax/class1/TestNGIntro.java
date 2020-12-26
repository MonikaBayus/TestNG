package com.syntax.class1;

import org.testng.annotations.Test;

public class TestNGIntro {


    @Test //annotation to execute our code, main annotation
    public void hello(){

        System.out.println("Hello");
    }

    @Test
    public void sayBye(){

        System.out.println("Good by");
    }

    @Test
    public void howAreYou(){
        System.out.println("How are you today?");
    }

}

//@test - Interface that comes from our testNG library;
//