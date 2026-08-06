class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MyQueue {
    Node head;
    Node tail;
    int size;
    int peek() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.val;
    }
    int remove() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }
    void add(int val) {
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
       MyQueue q = new MyQueue();
       q.add(10); 
       q.add(20);
       q.add(30);
       q.display();
       System.out.println(q.remove());
       q.display();
    }
}

