package com.codegnan.arrays;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the Size of  array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum of array elements is: " + sum);
        
        scanner.close();

		
		        
	}

}
