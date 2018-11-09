package com.winning.util.optimize;

public class DemoStatic {
    static void staticMethod(){

    }

    void instanceMethod(){

    }

    public static void main(String []args){
        long start = System.currentTimeMillis();
        for(long i = 0 ;i<1000000000;i++){
            DemoStatic.staticMethod();
        }
        System.out.println(System.currentTimeMillis()-start);

        start = System.currentTimeMillis();
        DemoStatic demoStatic = new DemoStatic();
        for(long i = 0 ;i<1000000000;i++){
            demoStatic.instanceMethod();
        }
        System.out.println(System.currentTimeMillis()-start);

    }
}
