package two;

public class Ticket implements Runnable {
    private int tickNum=10;
    @Override
    public void run() {
        while (true){
            //1.模拟出票时间
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //2。打印进程号和票号，票数减1
            String name=Thread.currentThread().getName();
            System.out.println("线程"+name+"售票："+tickNum--);
        }
    }
}
