public class OneD_to_TwoD {
    public static void main(String[] args) {



        int r=2;

        int c=2;
     int[] mat={ 1, 2 ,3, 10};
     int [][]res=construct2DArray(mat, r,c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j]+"  ");

            }
            System.out.println();

        }
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int [][] ori= new int[m][n];int p=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                while(p<original.length)
                    ori[i][j]=original[p++];
            }
        }
        return ori;
    }
}
