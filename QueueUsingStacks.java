import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    // public void push(int x) { //O(1)
    //     st.push(x);
    // }
    // public int pop(){   //O(n)
    //     //st ka bottom remove karo
    //     while(st.size() > 1){
    //         helper.push(st.pop());
    //     }
    //     int ans = st.pop();
    //     while(!helper.isEmpty()){
    //         st.push(helper.pop());
    //     }
    //     return ans;
    // }
    // public int peek() { //O(n)
    //     //st ka bottom print karo
    //     while(st.size() > 1){
    //         helper.push(st.pop());
    //     }
    //     int ans = st.peek();
    //     while(!helper.isEmpty()){
    //         st.push(helper.pop());
    //     }
    //     return ans;
    // }
    // public boolean isEmpty() { //O(1)
    //     return (st.isEmpty());
    // }
    public void push(int x) {  //O(n)
        //push at bottom of st
        while(!st.isEmpty()) {
            helper.push(st.pop());
        }
        st.push(x);
        while(!helper.isEmpty()) {
            st.push(helper.pop());
        }
    }
    public int pop() { //O(1)
        return st.pop();
    }
    public int peek() { //O(1)
        return st.peek();
    }
    public boolean isEmpty() { //O(1)
        return st.isEmpty();
    }
}
