package Arrays;

public class BestTimeToBuyStock {
    // if you want to get positive value so use Math.abs() method
    public static int[] Optimal(int[] a){
        // [1,6,3,7,2]
        int min  = a[0];
        int max = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            min = Math.min(min,a[i]);


        }
        return new int[]{min,max};


    }

    public static void main(String[] args) {
        int[] a = {1,5,0,7,2,8};
        int[] ans = Optimal(a);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
