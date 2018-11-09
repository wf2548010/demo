package com.winning.util.optimize;

public class DemoStaticOrder  extends DemoStaticOrderParent{
    /**
     * Static块的加载顺序是按照代码的顺序执行的
     * 先加载父类的静态块，然后子类的静态块，然后父类的构造方法，最后子类的构造方法
     */
    static {
        System.out.println("Child Static Block");
    }

    static {
        System.out.println("Child Static Bolck1");
    }

    public DemoStaticOrder(){
        System.out.println("Child Construct Method");
    }

    public static void main(String []args){
        DemoStaticOrder demoStaticOrder = new DemoStaticOrder();
    }

}
