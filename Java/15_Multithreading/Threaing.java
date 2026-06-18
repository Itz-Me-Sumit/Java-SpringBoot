public class Threaing{
    public static void main(String [] agrs){
        MyThread t1 = new MyThread();
        t1.start(); // JVM saying OS to create a new thread
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("THread is Running");
    }
}