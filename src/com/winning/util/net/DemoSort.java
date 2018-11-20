package com.winning.util.net;

public class DemoSort implements Runnable {


    private String num;

    public DemoSort(int num){
        this.num = num+"";
    }

    public static void main(String []args){
        int []nums = {12,13,11,2,998,5455,1,152,990};
        for(int i = 0;i<nums.length;i++){
            new Thread(new DemoSort(nums[i])).start();
        }
    }


    @Override
    public void run() {
        Thread.currentThread().setName(num+"Thread");
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(Thread.currentThread().getName()+"---"+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
