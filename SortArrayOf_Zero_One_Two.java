package Arrays;

public class SortArrayOf_Zero_One_Two {
    public static int[] BruteForce(int[] a){
        int one = 0;
        int zero = 0;
        int two = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]==0)zero++;
            if(a[i]==2)two++;
            if(a[i]==1)one++;
        }

        for(int i = 0;i<one;i++){
            a[i]=0;
        }
        for(int i = zero;i<zero+one;i++){
            a[i]=1;
        }
        for(int i = zero+one;i<a.length;i++){
            a[i]=2;
        }
        return a;
    }
    public static int[] Optimal(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int tem = arr[low];
                arr[low]=arr[mid];
                arr[mid]=tem;
                low++;
                mid++;
            }
           if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                int tem = arr[mid];
                arr[mid]=arr[high];
                arr[high]=tem;
                high--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,2,1,0,0,1,2,0,2,2};
        int[] ans = Optimal(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
