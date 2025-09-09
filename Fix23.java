package com.codegnan.arrays;

public class Fix23 {
	public static int[]fix23(int[] nums){
		//check if number[0]is 2 & number[1] is3 i.e either 2 should be at zero index or it must be at first index
		if(nums[0]==2&&nums[1]==3) {
			nums[1]=0;
		}
		if(nums[1]==2&&nums[2]==3) {
			nums[2]=0;
		}
		return nums;
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]testCases= {{1,2,3},
				{1,2,2},
				{2,3,3},
				{2,3,2},
				{2,2,2},
				{2,2,3}};
		for(int i=0;i<testCases.length;i++) {
			int[]result=fix23(testCases[i]);
			System.out.println("Test case"+(i+1)+":");
			printArray(result);
		}
		

	}

}
