package Arrays;
import java.util.*;
public class Leaders_In_Array {
    public static int[] BruteForce(int[] a){
        //[10,22,12,3,23,6]
        // find the leader which is grater than right side of all the element

        int[] ans = new int[a.length];
        for(int i = 0;i<a.length-1;i++){
              boolean flag = true;
            for(int j = i+1;j<a.length;j++){
                if(a[j]>a[i]){
                     flag = false;
                     break;
                }
            }
            if(flag==true){
                ans[i]=a[i];
                ans[ans.length-1]=a[a.length-1];
            }

        }
        return ans;
    }
public static List<Integer> Optimal(int[] a){
     List<Integer> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = a.length-1;i>=0;i--){
            if(a[i]>max){
                max = a[i];
                ls.add(a[i]);

            }
        }
        return ls;

}
    public static void main(String[] args) {
        int[] a = {10,22,12,3,23,6};
        List<Integer> al = Optimal(a);
        System.out.println(al);

        int[] ans  = BruteForce(a);
        for(int x:ans){
            System.out.print(x+" ");
        }


    }
}
