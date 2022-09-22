package com.varad.datastructures.sorting;

public class BubbleSort {
	
	
	public static void sort(int arr[],int n) 
	{
		 int i, j, temp;
		    for(i = 0; i < n; i++)
		    {
		        for(j = 0; j < n-i-1; j++)
		        {
		            if( arr[j] > arr[j+1])
		            {
		                // swap the elements
		                temp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = temp;
		            } 
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
