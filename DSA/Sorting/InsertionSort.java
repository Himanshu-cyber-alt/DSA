package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void Insertion(int[] a,int n){

        for(int i = 0;i<n;i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int tem = a[j-1];
                a[j-1]=a[j];
                a[j]=tem;
                 j--;
            }
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] a = new int[size];
        for(int i = 0;i<a.length;i++){
         a[i]= s.nextInt();
        }
        Insertion(a,size);

        for(int x:a){
            System.out.print(x+" ");
        }


    }
}
