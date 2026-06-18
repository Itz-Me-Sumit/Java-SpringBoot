public class Runnable_Interface {
    public static void main(String [] agrs){
        myRunnable r1 = new myRunnable();
        Thread t1 = new Thread(r1);
        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println("Current Thread is "+Thread.currentThread().getName());
        });

        t2.start();
    }
}

class myRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is Running");
    }
}