package com.winning.util.optimize;

public class DemoLocalVarible {
    private static int a = 0;


    public static void main(String []args){
        int b = 0;
        long start = System.currentTimeMillis();
        for(int i = 0 ;i<100000000;i++){
            b++;
        }
        System.out.println("localVar:"+(System.currentTimeMillis()-start));

        start = System.currentTimeMillis();
        for(int i = 0 ;i<100000000;i++){
            a++;
        }
        System.out.println("staticVar:"+(System.currentTimeMillis()-start));


    }


}
