package com.codegnan.arrays;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Rows for MatrixA:");
		int rowsA=scanner.nextInt();
		System.out.println("Enter Number of Columns For MatrixA:");
		int columnsA=scanner.nextInt();
		System.out.println("Enter Number of Rows for MatrixB:");
		int rowsB=scanner.nextInt();
		System.out.println("Enter Number of Columns For MatrixB:");
		int columnsB=scanner.nextInt();
		if(columnsA!=rowsB) {
			System.out.println("Multiplication of matrix is not possible because columns in matrixA is not equal to rows in MatrixB");
			scanner.close();
			return;
		}
		int[][]matrixA=new int[rowsA][columnsA];
		int[][]matrixB=new int[rowsB][columnsB];
		int[][]matrixProduct=new int[rowsA][columnsB];
		System.out.println("Enter The Elements of MatrixA:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of MatrixA:");
        for (int[] row : matrixA) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        
        System.out.println("Enter The Elements of MatrixB:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of MatrixB:");
        for (int[] row : matrixB) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixProduct[i][j] = 0;
                for (int k = 0; k < columnsA; k++) {
                    matrixProduct[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(matrixProduct[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();

	}

}
