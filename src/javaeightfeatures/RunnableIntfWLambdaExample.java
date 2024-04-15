package javaeightfeatures;

public class RunnableIntfWLambdaExample {
    public static void main(String[] args) {
        // Implementing the run() method of Runnable interface
        //child thread class
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        // main thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
    
}
