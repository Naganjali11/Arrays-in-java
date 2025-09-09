package com.codegnan.arrays;

public class FirstLast6 {
	public static boolean firstLast6(int[] arr) {
        // Check if 6 is at the first or last position
		return arr[0] == 6 || arr[arr.length - 1] == 6;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int[] arr1 = {6, 1, 2};
	        int[] arr2 = {1, 2, 6};
	        int[] arr3 = {1, 2, 3};

	        System.out.println(firstLast6(arr1)); // true
	        System.out.println(firstLast6(arr2)); // true
	        System.out.println(firstLast6(arr3)); // false

	}

}
