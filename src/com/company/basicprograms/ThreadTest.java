package basicprograms;

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

class MultiThread extends Thread {
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class ThreadTest {
    public static void main(String arg[]) {
        Thread thread = new Thread(new MyThread());
        thread.run();
        thread.run();
        thread.start();

        // int n = 8;
        // for (int i = 0; i < n; i++) {
        // Thread object = new Thread(new MultiThread());
        // object.start();
        // }
    }
}