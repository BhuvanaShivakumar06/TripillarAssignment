package Assignment2.Module5;

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
    }
}

