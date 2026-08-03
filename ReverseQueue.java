import java.util.Queue;
import java.util.Stack;
public class ReverseQueue {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }
}
