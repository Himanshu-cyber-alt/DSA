package Big_O_Notation;

public class DropDominantTerm {
    public static void print(int n){
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){         // O(N*2)
                System.out.println(i+" "+j);
            }
        }

        for(int k = 0;k<n;k++){          // O(N)
            System.out.println(k);
        }

        // O(N*2) + O(N) = O(N*2 + N) we drop N
        // O(N*2)
    }
    public static void main(String[] args){
        // O(N*2) is loop inside loop or nested loop
        print(5);



    }
}
