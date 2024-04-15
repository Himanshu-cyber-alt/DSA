package Big_O_Notation;

public class DropConstant {

    public static void display(int n){

        for(int i =0;i<=n;i++){   // O(N)
            System.out.println(i);
        }

        for(int j = 0;j<=n;j++){   // O(N)
            System.out.println(j);
        }

        // O(N) + O(N) = O(2N) instant of 2 we drop 2 which is constant
        // O(2N) = O(N) we drop constant

    }
    public static void main(String[] args){



    }
}
