import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueues {
    Queue<Integer> q = new LinkedList<>();
    public void push(int x) { //O(1)
        q.add(x);
    }
    public int pop() { //O(n)
        int n = q.size();
        for(int i=1; i<=n; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }
    public int top() { //O(n)
        int n = q.size();
        for(int i=1; i<=n; i++) {
            q.add(q.remove());
        }
        int p = q.peek();
        q.add(q.remove()); // imp
        return p;
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
