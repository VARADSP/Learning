package com.varad.programs;

public class SelectionSort {
	public void seletionSort() {
int[] a = {3,4,2,1,9};
		
		int temp;
		int min_index;
		for(int i=0;i<a.length;i++) {
			
			min_index = i;
			
			for(int j=i;j<a.length;j++) {
				
				if(a[j]<a[min_index]) {
					min_index = j;
				}
			}
			 temp = a[min_index]; 
	         a[min_index] = a[i]; 
	         a[i] = temp; 		
		}
		
		
		for(int k:a) {
			System.out.println(k);
		}
	}
	
	public static void main(String[] args) {
int[] a = {3,4,2,1,9};
		
		int temp;
		
		for(int i=0;i<a.length-1;i++) {
				for(int j=0;j<a.length-i-1;j++) {
					if(a[j] > a[j+1]) {
						 temp = a[j]; 
		                    a[j] = a[j+1]; 
		                    a[j+1] = temp;
					}
				}
		
		}
		
		for(int k:a) {
			System.out.println(k);
		}
		
	}
}
