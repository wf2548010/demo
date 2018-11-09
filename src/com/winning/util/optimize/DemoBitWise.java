package com.winning.util.optimize;

public class DemoBitWise {
    public static void main(String []args){
        long start = System.currentTimeMillis();
        long a = 1000;
        for(int i = 0;i<10000000;i++){
            a*=2;
            a/=2;
        }
        System.out.println(a);
        System.out.println(System.currentTimeMillis()-start);

        start = System.currentTimeMillis();
        for(int i = 0;i<10000000;i++){
            a<<=1;
            a>>=1;
        }
        System.out.println(a);
        System.out.println(System.currentTimeMillis()-start);
    }
}
