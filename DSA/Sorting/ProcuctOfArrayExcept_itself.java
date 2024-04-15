package Sorting;

import java.util.ArrayList;

public class ProcuctOfArrayExcept_itself {
   public static int[] Product(int[] a){
       int n = a.length;
int[] ans =new int[a.length];
int index = 0;
       int i = 0;
       int j  = 0;

       int sum = 1;
       while(i<n){

           if(i!=j){

                sum = sum * a[j];
           }

           j++;

        if(j>n-1){
             ans[index++]=sum;
               j = 0;
               i++;
               sum = 1;
           }



       }
return ans;
   }

    public static void main(String[] args) {
       int[] a = {0,0};
int[] ans = Product(a);

for(int x:ans){
    System.out.print(x+" ");
}
    }
}
