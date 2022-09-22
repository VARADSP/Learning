package com.varad.datastructures.sorting;

public class InsertionSort {
	
	static void sort(int arr[], int length) 
	{
		int i, j, key;
		for (i = 1; i < length; i++) 
		{
			j = i;
	 		while (j > 0 && arr[j - 1] > arr[j]) 
	 		{
	 			key = arr[j];
	 			arr[j] = arr[j - 1];
	 			arr[j - 1] = key;
	 			j--;
	 		}
		}
		
	}
	
	
public static void print(int[] a) {
		
		for(int i:a) {
			System.out.print(i);
			System.out.print(' ');
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {3,55,8,54,4,2,1};
		
		
		sort(a, a.length);
		print(a);
		
		
		
	}


}
