public class ThreadLifecycle {
    public static void main(String [] agrs){
        // Thread new Stage
        Thread t1 = new Thread(()->{
            System.out.println("Name Of  current thread is : " + Thread.currentThread().getName());
        });

        System.out.println(t1.getState());
        t1.start();

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(t1.getState());
    }   
}
