package com.codegnan.arrays;
import java.util.Scanner;
public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scanner.nextInt();
		int[] numbers=new int[size];
		System.out.println("Enter Elements in Array:");
		for(int i=0;i<size;i++) {
			numbers[i]=scanner.nextInt();
		}
		int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
		//int sum = 0;
        //for (int num:numbers) {
            //sum += num;
        //}
        double average=(double)sum/size;
        System.out.println("Average of elements in Array: "+average);
        scanner.close();

	}

}
