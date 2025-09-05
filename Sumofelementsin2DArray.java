package com.codegnan.arrays;
import java.util.Scanner;
public class Sumofelementsin2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int rows=scanner.nextInt();
		System.out.println("Enter Number Of Columns:");
		int columns=scanner.nextInt();
		int[][]array=new int[rows][columns];
		System.out.println("Enter the Elements of 2D array");
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
		int sum=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum+=array[i][j];
				
			}
			
		}
		System.out.println("The sum of the elements in the 2D Array is"+sum);
		scanner.close();

	}

}
