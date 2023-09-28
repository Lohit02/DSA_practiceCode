import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();
       int c = sc.nextInt();
       int [][] matrix= new int[r][c];
       int [][] matrix2= new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(matrix[i][j]+" ");

            }
            System.out.println(" ");

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(matrix2[i][j]+" ");

            }
            System.out.println(" ");

        }

        System.out.println("matrix Addition");

        // matrix addition

         int [][] finalMatrix= new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

        finalMatrix[i][j]= matrix[i][j]+matrix2[i][j];
            }

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(finalMatrix[i][j]+" ");

            }
            System.out.println(" ");

        }


    }

}
