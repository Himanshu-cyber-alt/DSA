package Sorting;
//
public class QuickSort {
    public static int FindPivot(int[] a,int low,int high){
        int pivot = a[low];
        int i = low;
        int j = high;
        while(i<j){
            while(a[i]<=pivot && i<high-1){
                i++;
            }
            while(a[j]>=pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int tem = a[i];
                a[i]=a[j];
                a[j]=tem;
            }

        }
        int tem = a[low];
        a[low]=a[j];
        a[j]=tem;
        return j;

    }
    public static void Quick(int[] a,int low,int high){
        if(low<high){

            int pivot = FindPivot(a,low,high);
            Quick(a,low,pivot-1);
            Quick(a,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {4,6,2,5,7,9,1,3};
        Quick(a,0,a.length-1);
        for(int x:a){
            System.out.print(x+" ");
        }
    }

}
