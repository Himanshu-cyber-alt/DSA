package Sorting;

public class BubbleSort {
    public static void Bubble(int[] a,int n){
        // bubble sort we compare adjacent element
        // {5,3,52,8,4,1,2};  n = 7
        for(int i = n-1;i>=1;i--){
            boolean didSwap = false;
            for(int j =  0;j<=i-1;j++){
                if(a[j]>a[j+1]){
                    int tem = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    didSwap = true;
                }
            }
            System.out.println("runs");
            if(!didSwap){
                break;
            }
        }

    }

    public static void main(String[] args) {
      //  int[] a ={5,3,52,8,4,1,2};
        int[] a = {1,2,3,4,5,6};
        int n = a.length;
        Bubble(a,n);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
