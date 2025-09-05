package com.codegnan.arrays;
import java.util.Scanner;

public class rowWiseProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Rows:");
		int rows=scanner.nextInt();
		System.out.println("Enter number of Columns:");
		int columns=scanner.nextInt();
		int array[][]=new int[rows][columns];
		System.out.println("Enter Elements of 2D Array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter element at row"+(i)+"column"+(j)+":");
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Elements in 2d Array:");
		for(int[]row:array) {
			for(int num:row) {
				System.out.print(num+" ");
			}
		
			System.out.println();
		
		}
		for(int i=0;i<rows;i++) {
			int rowproduct=1;
			for(int j=0;j<columns;j++) {
				rowproduct*=array[i][j];
			}
		
		System.out.println("Product of row"+(i+1)+"="+rowproduct);//if i is0,printing i+1 will show "sum of row1" if i=1 it shows sum of row2
		}
		scanner.close();
	
	}

}
