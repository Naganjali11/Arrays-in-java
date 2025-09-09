package com.codegnan.arrays;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the array with some sample elements
		int[] array= {1,2,3,2,1,4,3,5,1};
		//a boolean array to track which elements have benn tracked already
		boolean[] processed=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			//if element at index i has already been processed skip it
			if(processed[i]) {
				continue;
			}
			//initialize the count for the current element
			int count=1;
			//inner for loop to compare the current element to the rest of elements.
			for(int j=i+1;j<array.length;j++) {
				//if the element at index j is equal to the element at index i
				if(array[j]==array[i]) {
					count++;//increment the count for that element
					processed[j]=true;//mark the element at index j as processed
					
				}
			}
			System.out.println(array[i]+" "+"Occurs"+" "+count+" "+"Times");
		}

	}

}
