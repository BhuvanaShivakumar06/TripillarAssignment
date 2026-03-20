package Assignment4.Module11;

import java.util.LinkedList;
import java.util.Queue;
public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Doc1");
        queue.add("Doc2");
        queue.add("Doc3");

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }
    }
}
