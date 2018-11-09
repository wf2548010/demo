package com.winning.util.optimize;

public class DemoVarInit {
    //static
    {
        variableA = 1;
    }

    private static int variableA = 2;

    public static void main(String[] args){
        DemoVarInit demoVarInit = new DemoVarInit();
        System.out.println(demoVarInit.variableA);
    }


}
