package com.codegnan.arrays;

public class RotateLeft3 {
	public static int[] rotateLeft3(int[] nums) {
		//it assumes num size is 3
		return new int[] {nums[1], nums[2], nums[0]};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {5,11,9};
		int[] arr3= {7,0,8};
		printArray(rotateLeft3(arr1));
		printArray(rotateLeft3(arr2));
		printArray(rotateLeft3(arr3));

	}
	private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
