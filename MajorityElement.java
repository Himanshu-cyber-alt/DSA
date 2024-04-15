package Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static int BruteForce(int[] a) {

        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > n / 2) return a[i];
            }
        }
        return -1;
    }



    public static int Better(int[] a){
        int n = a.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<a.length;i++){
            int value = hm.getOrDefault(a[i],0);
            hm.put(a[i],value+1);
        }
        for(int i =0;i<a.length;i++){
            if(hm.get(a[i])>n/2){
                return a[i];
            }
        }

return -1;
    }
    public static int Optimal(int[] a){
        // int[] a = {2,5,4,7,2,2,1,2,2,2}
        int element = a[0];
        int count = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]==element){
                count++;
            }
            if(a[i]!=element){
                count--;
            }
            if(count==0){
                element = a[i];
                count++;
            }
        }
        return element;
    }


    //
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,1,3,2};
        int ans = Optimal(arr);
        System.out.println(ans);
    }
}
