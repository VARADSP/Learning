package com.varad.programs;

public class CountingInversions {
//using merge sort
	
	
	
	// Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
   static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            {   arr[k] = L[i]; 
                i++; 
            } 
            else
            {
            	// inversions += (m + 1) - (l + i);
            	inversions += (n1- i);
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
	
	static long inversions = 0;
	
	static void mergeSort(int[] arr,int left,int right) {
		if(left<right) {
			int middle = (left+right)/2;
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			merge(arr,left,middle,right);
		}
	}
	
	
	
	
	
    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
    	inversions=0;
    	mergeSort(arr,0,arr.length-1);
    	return inversions;
    }

	
	
	public static void main(String[] args) {
		
		int arr[] = {1,20,6,7,5,8,11,3};
		int arr1[] = {2,1,3,1,2};
		
		System.out.println(countInversions(arr));
		System.out.println(countInversions(arr1));
		
	}
	
	
	
}
