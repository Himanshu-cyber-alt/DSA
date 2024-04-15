package Big_O_Notation;

public class SpaceComplexityO_N {

   public static int sum(int n){
       // Space Complexity O(N)

 if(n<0){
     return 0;
 }
 return  n+sum(n-1);

   }

    public static void main(String[] args){
        System.out.println(sum(5));
    }
}
