package Arrays;

import java.util.HashMap;

public class LongestSubArrayWithK {
    public static int[] Optimal(int[] a,int k){
        // [1,3,5,2,15,6,7] sum = 9
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum =sum+a[i];
            int more = a[i]-sum;
            if(hm.containsKey(more)){
                int start = hm.get(more);
                   return new int[]{start,i+1};
            }
            if(!hm.containsKey(k-sum)){
                hm.put(a[i],i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,6,7};
        int[] ans = Optimal(a,9);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
