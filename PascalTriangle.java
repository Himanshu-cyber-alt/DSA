package Arrays;

import java.awt.desktop.PreferencesEvent;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle {
    public static int RandC(int n,int r){
         n  =n-1;
         r = r-1;
        int ans = 1;
        for(int i = 0;i<r;i++){
            ans = ans*((n)-i);
            ans = ans/(i+1);
        }
        return ans;
    }
    public static int Row(int row){
        row = row-1;
        int res = 1;
        for(int i = 1;i<row;i++){
            res = res*(row-i);
            res = res/(i);
        }
        return res;
    }
    public static int FindElementIn_Row_and_Col(int[][] a,int row,int col ){
       int ans =  RandC(row,col);
       return ans;
    }
    public static int[][] PrintRow( int row){
        int[][] my = new int[6][6];
        for(int i = 0;i<row;i++){
            my[row][i]=Row(row);
        }
        return my;

    }

    public static void main(String[] args) {
        int[][] pascal = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
       int ans = FindElementIn_Row_and_Col(pascal,5,3);
        System.out.println(ans);

        int[][] your = PrintRow(5);
        for(int[] x:your){
            for(int a:x){
                System.out.print(a);
            }
            System.out.println();
        }




    }
}
