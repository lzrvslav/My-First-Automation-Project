package Lecture6.Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        print2DMatrixWithDynamicRowsAndColumns();
    }
    public static void print2DMatrixWithDynamicRowsAndColumns() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Please enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Please enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at ["+i+"]["+j+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
