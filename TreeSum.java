package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class TreeSum {
    public static List<List<Integer>> BruteForce(int[] a){

  Set<List<Integer>> ls = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                for(int k = j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==0){
                        List<Integer> ts = new ArrayList<>(List.of(a[i],a[j],a[k]));
                        //   Arrays.asList(a[i], a[j], a[k]);
                        ts.sort(null);
                            ls.add(ts);
                    }
                }
            }
        }
        List<List<Integer>> my =new ArrayList<>(ls);
        return my;
    }
    public static List<List<Integer>> Better(int[]a){

                 Set<List<Integer>> sl = new HashSet<>();

                 for(int i =0;i<a.length;i++){
                     Set<Integer> ts = new HashSet<>();
                     for(int j = i+1;j<a.length;j++){
                        int third = -(a[i]+a[j]);
                        if(ts.contains(third)){
                            List<Integer> temp =new ArrayList<>(List.of(a[i],a[j],third));
                            temp.sort(null);;
                            sl.add(temp);

                        }

                        ts.add(a[j]);
                     }
                 }

        List<List<Integer>> ans  =new ArrayList<>(sl);
                 return ans;
    }

    public static List<List<Integer>> Optimal(int[] a){

        // [-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2]
        int n = a.length;
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(a);

        for(int i = 0;i<n;i++){
            if(i!=0 && a[i]==a[i-1])continue;
            int j  = i+1;
            int k = n-1;
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                if(sum<0){j++;}
                else if(sum>0){k--;}
                else {
                    List<Integer> l =Arrays.asList(a[i],a[j], a[k]);
                    ls.add(l);
                    j++;
                    k--;
                    while(j<k && a[j]==a[j-1])j++;
                    while(j<k && a[k]==a[k+1])k--;
                }
            }
        }

return ls;


    }

    public static void main(String[] args) {
        int[] a = {-2,0,1,1,2};
        List<List<Integer>> ls = Optimal(a);
        for(List<Integer> x:ls){
            for(Integer y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
