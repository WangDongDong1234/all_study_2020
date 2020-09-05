package two;

public class TicketDemo {
    public static void main(String[] args) {
        //Ticket ticket=new Ticket();
        //Ticket2使用了同步代码块
        //Ticket3使用了同步方法
        //Ticket4使用了Lock，注意锁的位置
        Ticket4 ticket=new Ticket4();
        Thread thread1=new Thread(ticket,"窗口1");
        Thread thread2=new Thread(ticket,"窗口2");
        Thread thread3=new Thread(ticket,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
