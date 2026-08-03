import java.util.LinkedList;
import java.util.Queue;
public class TraversalInQueue {
    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(10); q.add(20); q.add(30); q.add(40);
    //     int n = q.size();
    //     for(int i=1; i<=n; i++) {
    //         System.out.print(q.peek()+" ");
    //         q.add(q.remove());
    //     }
    // }
    private static void display(Queue<Integer> q) {
        int n = q.size();
        for(int i=1; i<=n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        display(q);
        addAtIndex(q, 2, 60);
        display(q);
        peek(q,3);
        display(q);
        remove(q,1);
        display(q);
    }

    private static void addAtIndex(Queue<Integer> q, int idx, int val) {
    Queue<Integer> temp = new LinkedList<>();
    if(idx < 0 || idx > q.size()) {
        System.out.println("Invalid Index!");
        return;
    }
    for (int i = 0; i < idx; i++) {
        temp.add(q.remove());
    }
    temp.add(val);
    while (!q.isEmpty()) {
        temp.add(q.remove());
    }
    while (!temp.isEmpty()) {
        q.add(temp.remove());
    }
}

    private static int peek(Queue<Integer> q, int idx) {
    int n = q.size();

    for (int i = 0; i < idx; i++) {
        q.add(q.remove());
    }
    int ans = q.peek();
    for (int i = 0; i < n - idx; i++) {
        q.add(q.remove());
    }
    return ans;
}

    private static int remove(Queue<Integer> q, int idx) {
    int n = q.size();

    for (int i = 0; i < idx; i++) {
        q.add(q.remove());
    }
    int ans = q.remove();
    for (int i = 0; i < n - idx - 1; i++) {
        q.add(q.remove());
    }
    return ans;
}
}
