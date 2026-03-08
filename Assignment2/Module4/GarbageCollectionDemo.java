package Assignment2.Module4;

public class GarbageCollectionDemo {
    public void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj = new GarbageCollectionDemo();
        obj = null;
        System.gc();
    }
}
