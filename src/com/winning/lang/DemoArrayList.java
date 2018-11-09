package com.winning.lang;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String []args){
        //当初始化容量指定为负数时抛出IllegalArgumentException
        List list = new ArrayList(-10);
    }
}
