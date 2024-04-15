package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement_N_By_Three {
    // N/3
    public static List BruteForce(int[] a, int length){
        //[1,1,1,3,3,2,2,2]; length = 8  8/3 = 2 there are 2 element that are appear

        List<Integer> ls = new ArrayList<>();
               for(int i = 0;i<length;i++){
                   int count = 0;
                   for(int j = i;j<length;j++){
                       if(a[i]==a[j]){
                           count++;
                       }
                       if(count>length/3){
                           if(!ls.contains(a[i])) {
                               ls.add(a[i]);
                           }

                           break;

                       }




                   }
               }
               return ls;

    }
    public static List<Integer> Better(int[] a,int length){
        List<Integer> ls =new ArrayList<>();

        HashMap<Integer,Integer> hm =new HashMap<>();

        for(int i =0;i<length;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if(hm.get(a[i])>length/3)
                if(!ls.contains(a[i]))
                ls.add(a[i]);
        }
  return ls;

    }
    public static List<Integer> Optimal(int[] a,int length){
        List<Integer> ls = new ArrayList<>();
        int el1 =0;
        int el2  =0;
        int cnt1= 0;
        int cnt2 = 0;
        for(int i = 0;i<a.length;i++){
            if(cnt1==0 && a[i]!=el2 ){ el1=a[i]; cnt1=1;}
            else if(cnt2==0 && a[i]!=el1){ el2=a[i]; cnt2=1;}
            else if(el1==a[i])cnt1++;
            else if(el2==a[i])cnt2++;
            else{
                cnt2--;
                cnt1--;
            }


        }
   cnt1= 0;
        cnt2 = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==el1)cnt1++;
            if(a[i]==el2)cnt2++;
        }
        if(cnt1>=a.length/3)ls.add(el1);
        if(cnt2>=a.length/3)ls.add(el2);
        return ls;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,3,7,8,1,6,9};
        List<Integer> ls = Optimal(a,a.length);
        System.out.println(ls);
    }
}
