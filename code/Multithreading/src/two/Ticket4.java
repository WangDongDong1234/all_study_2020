package two;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket4 implements Runnable {
    private int tickNum=10;
    //定义锁对象，构造函数参数为线程是否可以公平的获取锁，true为公平，false为非公平（false即由某个线程独占），默认是false
    Lock lock=new ReentrantLock(true);
//    @Override
//    public void run() {
//        while (true){
//           if(tickNum>0){
//               lock.lock();   //todo   注意锁的位置
//               try {
//                   Thread.sleep(100);
//                   //2。打印进程号和票号，票数减1
//                   String name=Thread.currentThread().getName();
//                   System.out.println("线程"+name+"售票："+tickNum--);
//               }catch (InterruptedException e){
//                   e.printStackTrace();
//               }finally {
//                   lock.unlock();
//               }
//           }
//        }
//    }


    @Override
    public void run() {
        while (true){
            lock.lock();
            if(tickNum>0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
