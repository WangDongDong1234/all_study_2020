package one;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for(int i=0; i<10;i++){
            System.out.println("MyRunnable线程正在运行："+new Date().getTime()+"--"+i);
        }
        return "MyCallable执行完毕";
    }
}
