package Assignment4.Module10;
class LL {
    Node head; // Starting node of the list -> only access point
    private int size;
    LL(){
        size =0; // Initially list is empty
    }
    public class Node {
        String data; // The data of the node -> String Type
        Node next;// The address of the next node -> Node Type

        Node(String data) {
            this.data = data;
            this.next = null; // Initially node is connected to null
            size++;//Increment the size as a node is created
        }
    }
    public void printList(){
        Node temp = head;
        while( temp!= null){
            System.out.print(temp.data +"-->" );
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode = new Node(data);
        //Point the next node of new node to the head
        newNode.next = head;
        // This newNode is the new head of the list
        // Point the head to this new node
        head = newNode;

    }
    public void addLast(String data){
        //Create a new node
        Node newNode = new Node(data);
        // If the list is empty - head will point to null
        if(head == null){
            head = newNode; // The new node becomes the head of the list
            return;
        }
        // For multiple elements - we need to find the last(tail) node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        //After this loop is over we will be standing @ last node
        // Point the last node next to the newNode
        last.next = newNode;
    }
    public void removeFirst(){
        //Empty List -> Give a message to user & return to main
        if(head==null){
            System.out.println("Empty List.Can't remove head");
            return;
        }
        // Single element or multiple elements
        // For a single element -> if deleted -> head becomes null
        // For multiple elements -> if deleted -> head is the next node
        head = this.head.next;
        size--; // Reduce the size by 1 node
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty List.Can't remove tail");
            return;
        }
        // Single Element
        if (head.next == null){
            head= null;
            size--; //one node deleted
            return;
        }
        //For Multiple elements we need to find the second last and last
        // we use a two pointer approach
        Node secondlast = head;
        Node last = head.next;
        while (last.next != null){
            secondlast = last;
            last = last.next;
        }
        //After this loop is over , we will be at the correct
        // second last & last nodes respectively
        secondlast.next = null;
        // The last node will be cleared by JVM
        size--;
    }
    public void deleteTargetNode(String target){
        if(head==null){
            System.out.println("Empty List.Can't remove target");
            return;
        }
        // Case where head is the target node
        if(head.data.equals(target)){
            head= head.next; // Move the head to the next node
            size--;
            return;
        }
        // Case where the target is anywhere else in the list
        // Two Pointer Approach
        Node prev = null;
        Node curr = head;
        while(curr != null && !curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        //Check for null -> then we pass a message ->target not found
        if(curr==null){
            System.out.println("Target" + target + "Not found in the list");
        }
        // If found, make adjustments to the nodes & pointers
        prev.next = curr.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EEE");
        sll.addFirst("Sem");
        sll.addFirst("6Th");
        sll.addFirst("is");
        sll.addFirst("This");
        sll.printList();
        sll.addLast("Java");
        sll.addLast("DSA");
        sll.addLast("Training");
        sll.addLast("By TriPillar Solutions");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.deleteTargetNode("DSA");
        sll.printList();
    }
}

