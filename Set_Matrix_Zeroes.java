package Arrays;

public class Set_Matrix_Zeroes {

public static void row(int[][] a,int i){
    for(int j =0;j<a.length;j++){
        if(a[i][j]!=0){
            a[i][j]=6;
        }
    }
}
public static void col(int[][] a,int j){
    for(int i = 0;i<a.length;i++){
        if(a[i][j]!=0){
            a[i][j]=6;
        }
    }
}
    public static int[][] BruteForce(int[][]a) {
        // first find the zero
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0) {
                    // now int row except zero every element we set as -1
                    // similarly in column except zero every element we se as -1;
row(a,i);
col(a,j);

                }
            }

        }
// last step
        // now every -1 we set as zero
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[i][j]==6){
                    a[i][j]=0;
                }
            }
        }
        return a;


    }
    public static int[][]  Better(int[][] a){

    //  take row and col with length
    int row[] = new int[a.length];
    int col[] = new int[a[0].length];

    for(int i = 0;i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            if(a[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
    }
    for(int i = 0;i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            if(row[i]==1 || col[j]==1){
                a[i][j] = 0;
            }
        }
    }
return a;

    }
    public static int[][] Optimal(int[][] a){
    // step one take turn all column and row to zero except first a[0][0]
        int col0 = 1;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    if(j!=0){
                        a[0][j]=0;
                    }
                    else {
                        col0 = 0;
                    }
                }
            }

        }
        for(int i = 1;i<a.length;i++){
            for(int j = 1;j<a[i].length;j++){
                if(a[i][j]!=0){
                  if(a[i][0]==0 || a[0][j]==0){
                      a[i][j]=0;
                  }
                }
            }
        }
        if(a[0][0]==0){
            for(int j = 0;j<a.length;j++){
                a[0][j]=0;
            }
        }
        if(col0==0){
            for(int i = 0;i<a.length;i++){
                a[i][0]=0;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] a = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][]  ans  = Optimal(a);
        for(int[] x:ans){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println( );
        }


    }
}
