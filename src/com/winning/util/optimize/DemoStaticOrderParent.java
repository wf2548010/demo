package com.winning.util.optimize;

public class DemoStaticOrderParent{
    static{
        System.out.println("Parent Static Block");
    }

    public DemoStaticOrderParent(){
        System.out.println("Parent Construct Method");
    }
}
