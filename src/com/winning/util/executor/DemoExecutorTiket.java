package com.winning.util.executor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DemoExecutorTiket {

    private static int total = 100;

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(100);

        long startTime = getTimer("07:00:00")-new Date().getTime();
        executorService.scheduleAtFixedRate(new Runnable() {
                                     @Override
                                     public void run() {
                                         //synchronized(this){
                                             while(total>0){
                                                 try {
                                                     Thread.sleep(500);
                                                 } catch (InterruptedException e) {
                                                     e.printStackTrace();
                                                 }
                                                 total--;
                                                 System.out.println(Thread.currentThread().getName()+"--剩余"+total+"张票");
                                             }
                                             if(total<0){
                                                 System.out.println("您来的慢喽，票卖完了已经！");
                                             }
                                         //}
                                     }
                                 },
                startTime,
                1,
                TimeUnit.MILLISECONDS);
    }
    public static long getTimer(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        Date schedleTime = null;
        try {
            schedleTime = sdf.parse(sdfDay.format(date)+ " " +time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return schedleTime.getTime();
    }
}