package Sorting;

public class Merge_Sort_______ {
    public static void Merge(int[]a,int low,int mid,int high){
        int tem[] = new int[a.length];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left<=mid && right<=high){

            if(a[left]<=a[right]){
                tem[i++]=a[left];
                left++;
            }
            else {
                tem[i++]=a[right];
                right++;
            }

        }
        while(left<=mid){
            tem[i++]=a[left];
            left++;
        }

 while(right<=high){
            tem[i++]=a[right];
            right++;
        }
int idx = 0;
 for(int k = low;k<=high;k++){
     a[k]=tem[k-low];
 }

    }
    public static void Divide(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low >=high){
            return;
        }
        Divide(a,low,mid);
        Divide(a,mid+1,high);
        Merge(a,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {5,7,6,4,3,1,93,8,2};
        int mid = arr.length/2;
        Divide(arr,0,arr.length-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println(Math.abs(0-2));

    }
}
