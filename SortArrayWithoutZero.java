package Arrays;
import java.util.*;
public class SortArrayWithoutZero {
    public static void Merge(int[] a,int m,int[] b ,int n ){
      //  a = [1,2,3,0,0,0]
        // b = [2,5,6]
        int j = m;
        for(int i =0;i<n;i++){
            a[m]=b[i];
            m++;
        }
        Arrays.sort(a);



    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        Merge(a,3,b,3);

    for(int x:a){
        System.out.print(x+" ");
    }


    }
}
