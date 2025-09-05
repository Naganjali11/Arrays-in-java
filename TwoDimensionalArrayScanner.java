package com.codegnan.arrays;
import java.util.Scanner;
public class TwoDimensionalArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int rows=scanner.nextInt();
		System.out.println("Enter Number of Columns:");
		int columns=scanner.nextInt();
		int[][] matrix=new int[rows][columns];
		System.out.println("Enter Elements of Array From end user:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter element at row"+(i)+"column"+(j)+":");
				matrix[i][j]=scanner.nextInt();
			}
		}
		//Enhanced For loop
		System.out.println("Elements in 2d Array:");
		for(int[]row:matrix) {
			for(int num:row) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
