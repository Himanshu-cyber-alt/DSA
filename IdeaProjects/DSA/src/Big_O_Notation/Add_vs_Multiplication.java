package Big_O_Notation;

public class Add_vs_Multiplication {

    public static void show(int a,int b){
        for(int i = 0;i<=a;i++){
            System.out.println(i);  // O(a)
        }

        for(int j = 0;j<=b;j++){ // O(b)
            System.out.println(j);

            // O(a+b)
        }
    }

    public static void display(int a,int b){
        for(int i = 0;i<=a;i++){

            for(int j = 0;j<=b;j++){ // O(b)
                System.out.println(i+"  "+j);

                // O(a*b)
            }
        }


    }


    public static void main(String[] args){
        display(5,6);

    }
}
