package Big_O_Notation;

public class BigO {

    public  static int mul(int a){
        return a*a; // this is one operation
    }

    public static void main(String[] args){

        // O(1) number of operation is one
        // example choosing any card from the set of card

      System.out.print(mul(5));
    }
}
