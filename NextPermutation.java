package Arrays;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class NextPermutation {
    public static int[] Optimal(int[] a){

        // [2,1,5,4,3,0,0]
        // step one find the index which next index is grater than current index here its 1
        int n = a.length;
        int index = -1;
        for(int i =n-2;i>=0;i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }
        int f = 0;
        int l = n-1;
        if(index==-1){
            while(f<l){
                int tem =a[f];
                a[f]=a[l];
                a[l]=tem;
                f++;
                l--;
            }
            return a;
        }


        // now swap the index value to the which is just greater than index here is 3
        for(int j = n-1;j>=index;j--) {
            if (a[j] > a[index]) {
                int tem = a[j];
                a[j] = a[index];
                a[index] = tem;
                break;

            }
        }

        // third step is swap the  value from index+1 to length-1 of array
        int last = n-1;
        int first = index+1;
        while(first<last){
            int tem = a[first];
            a[first]=a[last];
            a[last]=tem;
            last--;
            first++;
        }



        return a;


    }

    public static void main(String[] args) {
        int[] a  = {3,2,1};
        a =  Optimal(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }


}
