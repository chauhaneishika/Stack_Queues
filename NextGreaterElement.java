import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1; //Last element has no next greater element
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--) { //second last element to first element
           while(st.size() > 0 && arr[i]>=st.peek()) st.pop();
           if(st.size() == 0) nge[i] = -1;
           else nge[i] = st.peek();
           st.push(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            result.add(nge[i]);
        }
        return result;
    }
}
