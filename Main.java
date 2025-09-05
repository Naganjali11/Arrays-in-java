package com.codegnan.arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		//step 1 first you can specify size of array based on user requirements
		System.out.println("Enter the size of Array:");
		int size=scanner.nextInt();
		int[] numbers=new int[size];//array construction
		System.out.println("Enter elements of Array:");
		for(int i=0;i<size;i++) {
			System.out.println("Element at index:"+i+":");
			numbers[i]=scanner.nextInt();
			
		}
		//accessing elements
		System.out.println("Elements in Array:");
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Element at index:"+i+":"+numbers[i]);
			
		}
		scanner.close();
	}

}
