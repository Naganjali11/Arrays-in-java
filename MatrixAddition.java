package com.codegnan.arrays;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int rows=scanner.nextInt();
		System.out.println("Enter Number of columns:");
		int columns=scanner.nextInt();
		int [][]matrixA=new int[rows][columns];
		int [][]matrixB=new int[rows][columns];
		int [][]sumMatrix=new int[rows][columns];
		System.out.println("Enter The Elements of MatrixA:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrixA[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Elements of MatrixA: ");
		for(int[]row:matrixA) {
			for(int num:row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		System.out.println("Enter The Elements of MatrixB:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrixB[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Elements of MatrixB: ");
		for(int[]row:matrixB) {
			for(int num:row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
			}
		}
		System.out.println("Sum of the matrices:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(sumMatrix[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
