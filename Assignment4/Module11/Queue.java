package Assignment4.Module11;

public class Queue {

        private int[] arr;
        private int front, rear, size, capacity;

        public Queue(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.front = 0;
            this.size = 0;
            this.rear = capacity - 1; // Start rear at the end so first enqueue puts it at index 0
        }

        // Enqueue: Add an item to the back
        public void enqueue(int item) {
            if (size == capacity) {
                System.out.println("Queue Overflow! Cannot add " + item);
                return;
            }
            rear = (rear + 1) % capacity; // Circular increment
            arr[rear] = item;
            size++;
            System.out.println("Enqueued: " + item);
        }

        // Dequeue: Remove an item from the front
        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow! Nothing to remove.");
                return -1;
            }
            int item = arr[front];
            front = (front + 1) % capacity; // Circular increment
            size--;
            return item;
        }

        // Get the front item without removing it
        public int peek() {
            if (size == 0) return -1;
            return arr[front];
        }

        public boolean isEmpty() { return size == 0; }

        public static void main(String[] args) {
            Queue q = new Queue(3);

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            // This will trigger Overflow
            q.enqueue(40);

            System.out.println("Front item is: " + q.peek());
            System.out.println("Dequeued: " + q.dequeue());

            // Now we can add another because of circular logic
            q.enqueue(40);

            System.out.println("New Front item: " + q.peek());

            while (!q.isEmpty()) {
                System.out.println("Removing: " + q.dequeue());
            }
        }
    }

