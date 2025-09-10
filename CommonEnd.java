package com.codegnan.arrays;

public class CommonEnd {
	public static boolean commonEnd(int[] a,int[]b) {
		//both arrays are assumed to have equal length>=1
		return(a==b||a[a.length-1]==b[b.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,2,3};
		int[]arr2= {7,3};
		int[]arr3= {7,3,2};
		int[]arr4= {1,3};
		System.out.println(commonEnd(arr1,arr2));
		System.out.println(commonEnd(arr1,arr3));
		System.out.println(commonEnd(arr1,arr4));
		System.out.println(commonEnd(arr2,arr3));
		System.out.println(commonEnd(arr2,arr4));
		System.out.println(commonEnd(arr3,arr4));
	}

}
