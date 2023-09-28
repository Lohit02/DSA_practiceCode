import java.util.Scanner;

public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1 =sc.nextInt();
        int c1 = sc.nextInt();
        int[][]matrix1= new int[r1][c1];

        int r2 =sc.nextInt();
        int c2=sc.nextInt();
        int [][]matrix2=new int[r2][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j]=sc.nextInt();

            }

        }
         for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                matrix2[i][j]=sc.nextInt();


            }

        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                System.out.println(matrix1[i][j]+" ");


            }
            System.out.println(" ");

        }

         for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {

                System.out.println(matrix2[i][j]+" ");


            }
             System.out.println(" ");

        }




        if(c1!=r2)
        {
            System.out.println("Multiplication doesnot happens");
            return;
        }
        int matrix[][]=new int[r1][c2];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    for (int k = 0; k < c1; k++) {
                        matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                        System.out.println(matrix[i][j]+" ");
                    }
                    System.out.println(" ");
                }

            }





    }
}
