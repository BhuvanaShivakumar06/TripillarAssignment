package Assignment2.Module5;

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}
