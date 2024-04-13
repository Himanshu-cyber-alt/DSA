package Arrays;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> BruteForce(int[] a,int target){
        // you have to return the index  which sum = 0
     List<List<Integer>> ls = new ArrayList<>();
     for(int i = 0;i<a.length;i++){
         for(int j =i+1;j<a.length;j++){
             for(int k = j+1;k<a.length;k++){
                 for(int l = k+1;l<a.length;l++){
                     int sum = a[i]+a[j];
                     sum+=a[k];
                     sum+=a[l];
                     if(sum==target){
                         ArrayList<Integer> al =new ArrayList<>(List.of(i,j,k,l));
                         al.sort(null);
                         ls.add(al);
                     }
                 }
             }
         }
     }
     return ls;
    }
    public static List<List<Integer>> Optimal(int[] a,int target){

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for(int i =0;i<a.length;i++){
            if(i!=0 && a[i]-a[i-1]==0)continue;
            for(int j =i+1;j<a.length;j++){
                if(j!=i+1 && a[j]-a[j-1]==0)continue;
                int k = j+1;
                int last = a.length-1;


                while(k<last){
                    long sum =  a[i];
                    sum += a[j];
                    sum += a[k];
                    sum += a[last];

                    if(sum<target)k++;
                    else if(sum>target)last--;
                    else {
                    List<Integer> al = new ArrayList<>(List.of(a[i],a[j],a[k],(int)a[last]));
                        al.sort(null);
                        ans.add(al);

                        k++;
                        last--;

                        while (k<last && a[k]==a[k-1])k++;
                        while(k<last && a[last]==a[last+1])last--;
                    }
                }
            }

        }
        return ans;
    }
public static List<List<Integer>> Better(int[] a,int target){
        Set<List<Integer>> sl = new HashSet<>(); // duplicate are not allowed
        int n = a.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                Set<Integer> s = new HashSet<>();
                for(int k = j+1;k<n;k++){
                    int fourth = target-a[i]+a[j]+a[k];

                    if(s.contains(fourth)){
                        ArrayList<Integer> al = new ArrayList<>(List.of(i,j,k,fourth));
                        al.sort(null);
                        sl.add(al);
                    }
                    s.add(a[k]);
                }


            }
        }

        List<List<Integer>> ans = new ArrayList<>(sl);
        return ans;
}
    public static void main(String[] args) {
        int[] a = {1,0,-1,0,-2,2};
        List<List<Integer>> ls = Optimal(a, 0);
        for (List<Integer> x : ls) {
            for (Integer y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        }

}
