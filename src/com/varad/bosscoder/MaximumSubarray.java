//$Id$
package com.varad.bosscoder;

public class MaximumSubarray {

	public static void main(String[] args) {
		
		int[] nums = { 5,4,-1,7,8};
		int sum = nums[0];
		int maxSum = Integer.MIN_VALUE;
		for(int i=1;i<nums.length;i++) {
			if((sum + nums[i]) > nums[i]) {
				sum = sum+nums[i];
			}
			else {
				sum = nums[i];
			}
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
			
		System.out.println(maxSum);

	}

}
