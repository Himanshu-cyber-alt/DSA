package Arrays;
import java.util.*;
import java.text.BreakIterator;

public class LongestConsecutiveSequence {
    public static boolean LinearSearch(int[] a,int num){
        for(int i =0;i<a.length;i++){
            if(a[i]==num) return true;
        }
        return false;
    }
    public static int BruteForce(int[] a){
        int len = 0;
        for(int i = 0;i<a.length-1;i++){
            int x = a[i];
            int count = 1;
while(LinearSearch(a,x+1)==true){
    x++;
    count++;
}
len = Math.max(count,len);

        }
        return len;
    }
    public static int Better(int[] a){
        Arrays.sort(a);
        int small = Integer.MIN_VALUE;
        int count = 0;
        int maxLength= 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]-1==small){
                count++;
                small = a[i];
            }
            else if(a[i]!=small){
                count=1;
                small = a[i];

            }
            maxLength  = Math.max(maxLength,count);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] arr= {102,4,100,1,104,3,2,1,1};
        int ans = Better(arr);
        System.out.println(ans);
    }
}
