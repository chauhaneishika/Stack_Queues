import java.util.Stack;
//Largest rectangle in histogram
public class HistogramMaxRectangularArea {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n]; //next smaller element
        nse[n-1] = n; //samaj jao [-1]
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2; i>=0; i--) {
          while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
          if(st.size()==0) nse[i] = n;
          else nse[i] = st.peek();
          st.push(i);
        }
        while(st.size()>0) st.pop();

        int[] pse = new int[n]; //previous smaller element
        pse[0] = -1;
        st.push(0);
        for(int i=1; i<n; i++) {
          while(st.size()>0 && arr[st.peek()] >= arr[i]) st.pop();
          if(st.size()==0) pse[i] = -1;
          else psese[i] = st.peek();
          st.push(i);
        }
        int maxArea = 0;
        for(int i=0; i<n; i++) {
            int area = arr[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
