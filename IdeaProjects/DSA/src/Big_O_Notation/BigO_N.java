package Big_O_Notation;

public class BigO_N {

    public static void display(int a){
        for(int i =0;i<=a;i++){ // Its is Perform 10 operation from 0 to 9
                                 // which is O(N)
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        // Big O(N) perform the N operation
        // Example in deck of cards you will select diamond shape card
        //
        display(9);
    }
}
