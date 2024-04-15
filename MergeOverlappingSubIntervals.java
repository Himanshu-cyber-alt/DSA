package Arrays;

import java.text.BreakIterator;
import java.util.*;

class Harsh implements Comparator<int[]> {



    @Override
    public int compare(int[] a, int[] b) {
   if(a[0]<b[0])return -1;
   else if(a[0]>b[0])return 1;
   return 0;
    }
}
public class MergeOverlappingSubIntervals {

    public static int[][] BruteForce(int[][] a) {
        int f = 0;
        int l = 0;
        // first sort the array
        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(a, new Harsh());


        for (int i = 0; i < a.length; i++) {
            int start = a[i][0]; // 1
            int end = a[i][1];  // 3
            if (!ls.isEmpty() && end <= ls.get(ls.size() - 1).get(1)) continue;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j][0] <= end) {
                    end = Math.max(end, a[j][1]);

                } else {
                    break;
                }


            }
            ls.add(Arrays.asList(start,end));


        }
        int[][] newArr = new int[ls.size()][2];
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < 2; j++) {
                newArr[i][j] = ls.get(i).get(j);
            }

        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,4},{2,6},{8,9},{8,10},{9,11},{15,18},{16,17}};
        int[][] ans = BruteForce(arr);
        for(int[] x:ans){
            for(int Y:x){
                System.out.print(Y+" ");
            }
            System.out.println();
        }
    }
}





