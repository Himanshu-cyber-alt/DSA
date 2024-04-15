package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrange_Array_Elements_BySign {

    public static int[] Optimal(int[] a){


        int[] ans = new int[a.length];
        int even = 0;
        int odd = 1;

       for(int i  = 0;i<a.length;i++){
           if(a[i]>0 && even<a.length){
               ans[even]=a[i];
               even = even+2;
           }
            if(a[i]<0 && odd<a.length){
               ans[odd]=a[i];
               odd = odd+2;
           }
       }

        return ans;


    }
    public static int[] BruteForce(int[] a){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i =0;i<a.length;i++){
            if(a[i]>0)pos.add(a[i]);
            if(a[i]<0)neg.add(a[i]);
        }
        if(pos.size()>neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                a[i * 2] = pos.get(i);
                a[i * 2 + 1] = neg.get(i);
            }
        }
        if(pos.size()<neg.size()){
            for (int i = 0; i < pos.size(); i++) {
                a[i * 2] = pos.get(i);
                a[i * 2 + 1] = neg.get(i);
            }

        }

        return a;
    }

    public static void main(String[] args) {

        int[] my = {1,2,-4,-5,3,6};

        my = BruteForce(my);
        for(int x:my){
            System.out.print(x+" ");
        }

    }
}
