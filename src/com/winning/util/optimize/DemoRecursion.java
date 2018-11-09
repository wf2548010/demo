package com.winning.util.optimize;

public class DemoRecursion {
    private int count = 0;

    public void recursion(long a,long b,long c){
        long d = 0 ,e = 0, f = 0;
        count++;
        recursion(d,e,f);
    }

    public void testStack(){
        try {
            recursion(1l,2l,3l);
        }catch(Throwable e){
            System.out.println("deep of stack is "+count);
            e.printStackTrace();
        }
    }

    public static void main(String []args){
        DemoRecursion rs = new DemoRecursion();
        rs.testStack();
    }

}
