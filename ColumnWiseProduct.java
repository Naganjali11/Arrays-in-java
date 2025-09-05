package com.codegnan.arrays;

import java.util.Scanner;

public class ColumnWiseProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int rows=scanner.nextInt();
		System.out.println("Enter Number of Columns:");
		int columns=scanner.nextInt();
		int array[][]=new int[rows][columns];
		System.out.println("Enter the Elements in 2D array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter element at row"+(i)+"column"+(j)+":");
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println("The Elemnts in 2d Array:");
		for(int[]row:array) {
			for(int num:row) {
				System.out.print(num+" ");
			}
		
			System.out.println();
		
		}
		for(int j=0;j<columns;j++) {
			int columnproduct=1;
			for(int i=0;i<rows;i++) {
				
				columnproduct*=array[i][j];
			}
		
		System.out.println("Product of Columns"+(j+1)+"="+columnproduct);
		}
		scanner.close();


	}

}
