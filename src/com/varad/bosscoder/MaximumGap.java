//$Id$
package com.varad.bosscoder;

import java.util.Arrays;

public class MaximumGap {
	
	public static int maximumGap(int[] a) {
		// O(n) with O(n)

			if(a.length <2){
					return 0;
				}
				
		    int min = a[0];
		    int max = 0;
		    // find max and min!
		    for(int n : a){
		        min = Math.min(min,n);
		        max = Math.max(max,n);
		    }
		    // find interval!
		    int interval = (int)Math.ceil((max - min + 0.0)/(a.length-1));
		    // bucket!
		    int[] bucketmin = new int[a.length -1];
		    int[] bucketmax = new int[a.length -1];
		    Arrays.fill(bucketmin,Integer.MAX_VALUE);
		    Arrays.fill(bucketmax,-1);
		    
		    for(int i=0; i < a.length; i++){
		        if(a[i] == min || a[i] == max) continue;
		        int index = (a[i] - min)/ interval;
		        bucketmin[index] = Math.min(bucketmin[index],a[i]);
		        bucketmax[index] = Math.max(bucketmax[index],a[i]);
		    }
		    
		    int prev = min;
		    int maxgap = 0;
		    for(int i=0; i<bucketmin.length; i++){
		        if(bucketmax[i] == -1 ) continue;    
		        maxgap = Math.max(bucketmin[i] - prev,maxgap);
		        prev = bucketmax[i];
		    }
		    maxgap = Math.max(max - prev, maxgap);
		    return maxgap;
		    
		    
		    
		}
	
	public static void main(String[] args) {
		
		int[] nums = {3,6,9,1};
		System.out.println(maximumGap(nums));
//		
//		
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		
//		for(int i=0;i<nums.length;i++) {
//			max = Math.max(max, nums[i]);
//		}
//	
//		
//		for(int i=0;i<nums.length;i++) {
//			min = Math.min(min, nums[i]);
//		}
//		
//		
//		int[] space = new int[max-min+1];
//		
//		for(int i=0;i<nums.length;i++) {
//			space[nums[i]-1] = 1;
//		}
//		
//		int ans = 0;
//		int num1 = 0;
//		for(int i=0;i<space.length;i++) {
//			
//			if(num1 != 0) {
//				ans = Math.max(ans, i+1-num1);
//			}
//			
//			if(space[i] > 0) {
//				num1 = i+1;
//			}
//			
//		}
//		System.out.println(ans);
//		
		
		
	}

}
