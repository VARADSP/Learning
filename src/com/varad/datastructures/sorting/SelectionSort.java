package com.varad.datastructures.sorting;

public class SelectionSort {
	
	
	public static void sort(int arr[],int n) 
	{
		 int i, j, temp;
		    for(i = 0; i < n; i++)
		    {
		    	int min = i;
		        for(j = i+1; j < n; j++)
		        {
		            if( arr[j] < arr[i])
		            {
		                // swap the elements
		                temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
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
