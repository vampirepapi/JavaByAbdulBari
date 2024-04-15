package javaeightfeatures;

class ThreadDemo1 implements Runnable{
    // Implementing the run() method of Runnable interface
    //child thread class
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}

public class RunnableIntfWOLambdaExample  {
    public static void main(String[] args) {
        ThreadDemo1 t = new ThreadDemo1();
        Thread t1 = new Thread(t);
        t1.start();
        // main thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }


}
