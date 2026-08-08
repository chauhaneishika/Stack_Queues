import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class FirstNegativeInEveryWindowOfSizek {
    static List<Integer> firstNegInt(int arr[], int k) {
       List<Integer> ans = new ArrayList<>();
       int n = arr.length;
       Queue<Integer> q = new LinkedList<>();
       for(int i=0; i<n; i++){
         if(arr[i] < 0) q.add(i);
       }
       for(int i=0; i<n-k+1; i++){
        //window is from i to i+k-1
        while(!q.isEmpty() && q.peek()<i) q.remove();
        if(!q.isEmpty() && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
        else ans.add(0);
       }
       return ans;
    }
}
// Time complexity: O(n)