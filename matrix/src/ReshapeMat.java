import java.util.Stack;

public class ReshapeMat {
    public static void main(String[] args) {
        int [][]mat= { { 1, 2 ,3, 10},
                       { 4, 5, 6,10},
                        {7, 8, 9, 10}
                                 };
        int r=6;

        int c=2;
        int [][]res=matrixReshape( mat, r,c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(res[i][j]+"  ");

            }
            System.out.println();

        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int R=mat.length;
        int C=mat[0].length;
        Stack<Integer> st=new Stack<>();

        int[][]matrix=new int[r][c];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                st.push(mat[i][j]);
            }
        }

        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                matrix[i][j]=st.pop();
            }
        }
        return matrix;
    }
}
