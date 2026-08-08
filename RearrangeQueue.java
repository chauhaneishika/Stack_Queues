// Interleave the First half of the queue with second half
import java.util.Queue;
import java.util.Stack;
public class RearrangeQueue {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1; i<=n/2; i++) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        for(int i=1; i<=n/2; i++) {
            st.push(q.remove());
        }
        // re arrangement
        while(!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
        //reverse the q
        while(!q.isEmpty()) {
            st.push(q.remove());
        }
        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        return q;
    }
}
// Steps:
// Put n/2 elements from q to st
// Put from st to q
// Put n/2 elements from q to st
// st se q mai && q se st mai
// reverse the q