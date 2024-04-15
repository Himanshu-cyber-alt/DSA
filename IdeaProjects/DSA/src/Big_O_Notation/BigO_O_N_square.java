package Big_O_Notation;

public class BigO_O_N_square {
    public static void print(int n){
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){
                System.out.println(i+" "+j);
            }
        }
    }
    public static void main(String[] args){
        // O(N*2) is loop inside loop or nested loop
        print(5);



    }
}
