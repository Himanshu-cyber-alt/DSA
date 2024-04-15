package Arrays;

import java.util.ArrayList;
import java.util.*;

public class Merge_Two_Sorted_Array_Without_Extra_Space {
    public static void BruteForce(int[]a,int n,int[]b,int m){
        // a[] = {1,3,5,7}
        // b[] = {0,2,6,8,9}
        n = a.length;
        m = b.length;

        int[] ans = new int[n+m];
        int i = 0;
        int j = 0;
        int index = 0;

        while(i<n && j<m){
            if(a[i]<=b[j]){
                ans[index]=a[i];
                i++;
                index++;
            }
            else{
                ans[index]=b[j];
                j++;
                index++;
            }

        }
        while(j<m){
            ans[index++]=b[j++];

        }
        while(i<n){
            ans[index++]=a[i++];
        }

        for(int k = 0;k<n+m;k++){
            if(k<n)a[k]=ans[k];
            else{
                b[k-n]=ans[k];
            }
        }


    }
public static void Optimal(int[]a ,int n,int[]b,int m){
        int  last = n-1;
        int first = 0;
if(last<n && first<m) {
    while (a[last] > b[first]) {
        // int a[] = {1,3,5,7};
        // int b[] = {0,2,6,8,9};
        int tem = a[last];
        a[last] = b[first];
        b[first] = tem;
        last--;
        first++;
    }
}
        Arrays.sort(a);
        Arrays.sort(b);
}
    public static void main(String[] args) {
        int a[] = {1,3,5,7};
         int b[] = {0,2,6,8,9};
        Optimal(a,a.length,b,b.length);

     for(int x:a){
         System.out.print(x+" ");
     }
        System.out.println();
     for(int y:b){
         System.out.print(y+" ");
     }
    }
}
