package Arrays;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class SubArray_Sum_Equals_K {
    public static int BruteForce(int[]arr,int k) {
        int n = arr.length;
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            for (int j = i; j < n; j++) { // ending index j

                // calculate the sum of subarray [i...j]
                int sum = 0;
                for (int K = i; K <= j; K++) {
                    sum += arr[K];}

                    // Increase the count if sum == k:
                    if (sum == k)
                        cnt++;

            }
        }
        return cnt;

    }
    public static int Better(int[] a,int t){
        int count = 0;
        int n = a.length;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j =i;j<n;j++){
                sum+=a[i];
                if(sum==t){
                    count++;
                }
            }

        }
        return count;
    }
    public static int Optimal(int[] arr,int k){
        int n = arr.length; // size of the given array.
        Map<Integer,Integer> mpp = new HashMap();
        int preSum = 0;
        int cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:

            cnt += mpp.getOrDefault(remove, 0);
            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);



        }
        return cnt;

    }

    public static void main(String[] args) {
        int[] ans = {1,1,1};
        int my =Optimal(ans,2);
        System.out.println(my);
    }
}
