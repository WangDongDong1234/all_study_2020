package one;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadCreateDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //testMyThread();
        //testMyRunable();
        //testMyCallable();
        //testMyExecutor();
    }

    private static void testMyThread() {
        //1.创建自定义线程
        MyThread thread=new MyThread();
        thread.start();
        //主线程循环打印
        for(int i=0;i<10;i++){
            System.out.println("main 主线程正在执行："+new Date().getTime()+"--"+i);
        }
    }

    private static void testMyRunable() {
        //1.创建自定义线程
        Thread thread=new Thread(new MyRunable());
        thread.start();
        //主线程循环打印
        for(int i=0;i<10;i++){
            System.out.println("main 主线程正在执行："+new Date().getTime()+"--"+i);
        }
    }

    private static void testMyCallable() throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask<String>(new MyCallable());
        //1.创建自定义线程
        Thread thread=new Thread(task);
        thread.start();
        //主线程循环打印
        for(int i=0;i<10;i++){
            System.out.println("main 主线程正在执行："+new Date().getTime()+"--"+i);
        }
        System.out.println(task.get());
    }

    private static void testMyExecutor() throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        executorService.execute(new MyRunable());
        //主线程循环打印
        for(int i=0;i<10;i++){
            System.out.println("main 主线程正在执行："+new Date().getTime()+"--"+i);
        }
    }
}
