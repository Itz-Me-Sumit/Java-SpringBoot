public class ThreadMethods{
    public static void main(String [] args){
        
        System.out.println("Main Thread Start");

        // .sleep()
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
        }

        // .join()
        Thread t1 = new Thread(()->{
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
            }
            System.out.println("Thread-0 Starts");
        });
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){

        }

        System.out.println("Main Thread Ends");

    }
}