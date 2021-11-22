package basicprograms;

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ThreadTest {
    public static void main(String arg[]) {
        Thread thread = new Thread(new MyThread());
        thread.run();
        thread.run();
        thread.start();
    }
}