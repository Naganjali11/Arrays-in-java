package com.codegnan.arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {31,5,7,45,60,4};
		System.out.println("Before Sorting");
		printArray(arr);
		bubbleSort(arr); // Sort the array

        System.out.println("After Sorting");
        printArray(arr);
		

	}
	public static void bubbleSort(int[] arr){
		int n=arr.length;
		//outer for loop for number of passes
		//after each pass, largest element moves to its correct position
		for(int i=0;i<=n-1;i++) {
			// A flag to check any swapping happens,used for optimization(best case)
		boolean swaped=false;
		//inner for loop for comparisions in each pass
		//(n-i-1)because last i element are already in correct position
		
			for(int j=0;j<n-i-1;j++) {
				//if current element is greater than the next, swap them
				if(arr[j]>arr[j+1]) {//31>45
					int temp=arr[j];//31
					arr[j]=arr[j+1];//5
					arr[j+1]=temp;//31
					//since we swapped marked as true
					swaped=true;
				}
			}
			//if no elements are swapped in this pass array is already sorted
			if(!swaped) {
				break;
			}
		}
	}
	public static void printArray(int[] arr) {
		for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
		
	}

}
