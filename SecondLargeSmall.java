package com.codegnan.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SecondLargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.print("Enter the array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array
        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondLargest = arr[n - 2];

        System.out.println("Second Largest Element: " + secondLargest + " "+"Second smallest element:" + secondSmallest);
        sc.close();
		

	}

}
