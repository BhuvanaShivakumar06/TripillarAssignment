package Assignment4.Module11;

public class Stack {

        private int[] arr;
        private int top;
        private int capacity;

        // Constructor to initialize the stack
        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push: Add an element to the top
        public void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow! Cannot push " + x);
                return;
            }
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }

        // Pop: Remove and return the top element
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow! Nothing to pop.");
                return -1;
            }
            return arr[top--];
        }

        // Peek: Look at the top element without removing it
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return arr[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Main method to run the program
        public static void main(String[] args) {
            // Create a stack with capacity of 3
            Stack myStack = new Stack(3);

            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            // This will trigger Stack Overflow
            myStack.push(40);

            System.out.println("Top element is: " + myStack.peek());

            System.out.println("Popped: " + myStack.pop());
            System.out.println("Popped: " + myStack.pop());

            System.out.println("Is stack empty? " + myStack.isEmpty());

            // Final pop
            System.out.println("Popped: " + myStack.pop());
            System.out.println("Is stack empty now? " + myStack.isEmpty());
        }
    }

