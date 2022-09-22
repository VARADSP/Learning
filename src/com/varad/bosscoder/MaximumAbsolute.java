//$Id$
package com.varad.bosscoder;

public class MaximumAbsolute {

	
	public static void main(String[] args) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int max4 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = Integer.MAX_VALUE;
		int min4 = Integer.MAX_VALUE;
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {-1,4,5,6};
		
		for(int i=0;i<arr1.length;i++) {
			max1 = Math.max(max1, arr1[i]+arr2[i]+i);
			max2 = Math.max(max2, arr1[i]+arr2[i]-i);
			max3 = Math.max(max3, arr1[i]-arr2[i]+i);
			max4 = Math.max(max4, arr1[i]-arr2[i]-i);
			
			
			min1 = Math.min(min1, arr1[i]+arr2[i]+i);
			min2 = Math.min(min2, arr1[i]+arr2[i]-i);
			min3 = Math.min(min3, arr1[i]-arr2[i]+i);
			min4 = Math.min(min4, arr1[i]-arr2[i]-i);
			
		}
		
		
		int ret = max1 - min1;
		
		ret = Math.max(ret, max2-min2);
		
		ret = Math.max(ret, max3-min3);
		
		ret = Math.max(ret, max4-min4);
		
		
		System.out.println(ret);
		
	}
}
