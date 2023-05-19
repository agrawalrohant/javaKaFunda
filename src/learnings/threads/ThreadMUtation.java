package learnings.threads;

class Counter {
    int counter;
    public synchronized void increment() {
        counter++;
    }
    
}
public class ThreadMUtation {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable r1 = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = () -> {
            for (int i = 0; i < 100000; i++) {
                c.increment();
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.counter);
    }
}
