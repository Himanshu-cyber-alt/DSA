package Arrays;

public class Kadanes_Algorithm {
    public static int BruteForce(int[] a){
        // [1, 2, 7, -4, 3, 2, -10, 9, 1]
        int max  = Integer.MIN_VALUE;


        for(int i = 0;i<a.length;i++){
            int value=0;
            for(int j = i;j<a.length;j++){
              value = value+a[j];
            }
            max = Math.max(max,value);
        }
        return max;
    }
    public static int Optimal(int[] a){
        //  [1, 2, 7, -4, 3, 2, -10, 9, 1]
        int max = 0;
        int sum = 0;
        int start = 0;
        int last = 0;
        int ansStart = -1 ;
        int ansEnd = -1;
        for(int i = 0;i<a.length;i++){
if(sum==0)start=i;
            sum+=a[i];
            if(sum>max){
                max =sum;
              ansStart  = start;
              ansEnd = i;
            }
            if(sum<0){
                sum =0 ;
            }

        }
        return max;
    }
public static boolean FindTheLength(int[] a){
    int max = 0;
    int sum = 0;
 int start = -1;
 int end = 0;
    for(int i = 0;i<a.length;i++){
      if(sum==0)start=i;
        sum+=a[i];
        if(sum>max){
            max =sum;
          end = i;
        }
        if(sum<0){
            sum =0 ;
        }

    }
    System.out.println(start+" "+end);


    return true;
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        int ans =  Optimal(arr);

        System.out.println(ans);

        // Find The Length Of Maximum SubArray
        System.out.print(FindTheLength(arr));
    }
}
