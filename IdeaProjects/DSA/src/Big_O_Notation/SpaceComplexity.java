package Big_O_Notation;

public class SpaceComplexity {

     //  O(1) Space Complexity
    public static int pariSumSequence(int n){
        int total = 0;
        for(int i = 0;i<=n;i++) {
            total = total + pairSum(i,i+1);
        }
        return total;
    }

    public static int pairSum(int a,int b){
        return a+b;
    }
   public static void main(String[] args){
     System.out.println(pariSumSequence(3));

   }
}
