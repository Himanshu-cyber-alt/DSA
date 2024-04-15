package Sorting;

public class SelectionSort {
    public static void Selection(int[] a){
        // a = {6,54,3,65,23,2};
        int n = a.length;
        for(int i  = 0;i<=n-2;i++){
            int x = i;
            for(int j = i;j<=n-1;j++){
            if(a[j]<a[x]){ x = j;
               };
                int tem = a[x];
                a[x]=a[i];
                a[i]=tem;
            // swap the value

            }
        }

    }

    public static void main(String[] args) {
        int[] a = {6,54,3,65,23,2};
        Selection(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
