package com.winning.util.executor;

import java.util.concurrent.*;

public class DemoExecutor {
    public static void main(String []args) throws ExecutionException, InterruptedException {
        /**ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("asynChronized!");
            }
        });

        service.shutdown();**/

        /**ExecutorService cacheService = Executors.newCachedThreadPool();
        Future future = cacheService.submit(new Callable<Object>() {
            @Override
            public Object call() {
                System.out.println("abc");
                return 1;
            }
        });

        future.get();**/

        /**ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        },10,20,TimeUnit.SECONDS);**/


        /**Executor executor = Executors.newCachedThreadPool();
        for(int i = 0;i<3;i++) {
            //去掉下面一行的注释，仅仅使用一条线程，因为newCacheThreadPool可以重复使用线程
            //TimeUnit.SECONDS.sleep(1);
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"------123");
                }
            });
        }**/

        /**
         * 线程池里面的线程数为3个，每个任务完成后停2秒，所以每次3个线程执行后 停两秒
         */
        /**Executor executor = Executors.newFixedThreadPool(3);
        for(int i = 0;i<10;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"---");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }**/


        Executor executor = Executors.newSingleThreadExecutor();
        for(int i = 0;i<10;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"---");
                    try {
                        Thread.sleep(2000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }



    }
}
