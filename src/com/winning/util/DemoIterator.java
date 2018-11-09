package com.winning.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

    public static void main (String []args){

        List list = new ArrayList();

        list.add(1);
        list.add(11);
        list.add(111);
        list.add(1111);
        list.add(11111);
        list.add(111111);
        list.add(1111111);
        list.add(11111111);
        list.add(111111111);

        Iterator iter = list.iterator();
        //会抛出NoSuchElementException异常
        /**while(iter.hasNext()){
            int i = (int) iter.next();
            int  j = (int) iter.next();
            System.out.println(1+"--"+j);
        }**/

        iter.remove();

        while (iter.hasNext()) {
            System.out.println(list.size());
        }

    }


}
