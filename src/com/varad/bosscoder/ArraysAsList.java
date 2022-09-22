//$Id$
package com.varad.bosscoder;
import java.util.*;

public class ArraysAsList {
	/*
	 *  	Array mix of integers
	 *  	e.g. 15 -2 2 -8 1 7 10 23
	 *      optimal solution ---- Using HashMap approach
	 *      problem find the longest subarray of sum=0 out of all subarrays in given array 
	 */
	 public static int maxLen(int arr[])
	    {
	        // Creates an empty hashMap hM
	        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
	        int sum = 0; // Initialize sum of elements
	        int max_len = 0; // Initialize result
	        // Traverse through the given array
	        for (int i = 0; i < arr.length; i++) {
	            // Add current element to sum
	            sum += arr[i];
	            if (arr[i] == 0 && max_len == 0)
	                max_len = 1;
	            if (sum == 0)
	                max_len = i + 1;
	            // Look this sum in hash table
	            Integer prev_i = hM.get(sum);
	            // If this sum is seen before, then update max_len
	            // if required
	            if (prev_i != null)
	                max_len = Math.max(max_len, i - prev_i);
	            else // Else put this sum in hash table
	                hM.put(sum, i);
	        }
	        return max_len;
	    }
	 
	 public static void maxLenBruteForce(int arr[])
	    {
			int maxStart = 0;
			int maxEnd = 0;
			int ans = 0;
			for(int i=0;i<arr.length;i++) {	
				int currentSum = arr[i];
				for(int k=i+1;k<arr.length;k++) {
					currentSum += arr[k];
					if(currentSum == 0) {
						if(k-i+1 > ans) {
							ans = k-i+1;
							maxStart = i;
							maxEnd = k;
						}
					}
				}	
				
			}
					
			for(int i=maxStart;i<=maxEnd;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
	   }
	 
	 public static int maxSubArrayLen(int[] arr)
	    {
	        HashMap<Integer, Integer> hm = new HashMap<>();
	        hm.put(0, 0);
	        int length = -1;
	        int cumSum = 0;
	 
  	        for (int i = 0; i < arr.length; i++) {
	            cumSum = cumSum + arr[i];
	 
	            if (hm.containsKey(cumSum)) {
	                length = Math.max(length,
	                                  i + 1 - hm.get(cumSum));
	            }
	            else {
	                hm.put(cumSum, i + 1);
	            }
	        }
	        return length;
	    }
	
	public static void main(String[] args) {
		int[] arr = {15,-2,2,-8,1,7,10,23};
//		maxLenBruteForce(arr);
		System.out.println(maxLen(arr));
//		System.out.println(maxSubArrayLen(arr));
	}
}
