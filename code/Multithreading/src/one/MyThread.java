package one;

import java.util.Date;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println("MyRunnable线程正在运行："+new Date().getTime()+"--"+i);
        }
    }
}
