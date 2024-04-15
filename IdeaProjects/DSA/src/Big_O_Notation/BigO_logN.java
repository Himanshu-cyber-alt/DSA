package Big_O_Notation;

public class BigO_logN {
    static int fact = 1;
    public static int  show(int n){
        if(n>0) {
            fact = fact * n;
           show(n - 1);
        }
        return fact;
    }
    public static  void main(String[] args){
        // log n is use in divide and conquered

        System.out.println(show(5));
    }
}
