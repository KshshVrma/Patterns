package Threads;

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Function {
    public static void main(String[] args) {
        Runnable myThread=new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread is running");
            }
        };
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread is running");
            }
        }

        );
        thread.start();
    }
}
