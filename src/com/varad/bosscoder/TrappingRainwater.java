//$Id$
package com.varad.bosscoder;

public class TrappingRainwater {
	
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int leftMax = 0;
		int rightMax = 0;
		int ans = 0;
		
		int[] maxValueOnLeft = new int[height.length];
		int[] maxValueOnRight = new int[height.length];
		
		
		for(int i=0;i<height.length;i++) {
			if(height[i]> leftMax) {
				leftMax = height[i];
			}
			maxValueOnLeft[i] = leftMax;
		}
		
		
		for(int j=height.length-1;j>=0;j--) {
			if(height[j]>rightMax) {
				rightMax = height[j];
			}
			maxValueOnRight[j] = rightMax;
		}
		
		for(int i=0;i<height.length;i++) {
			int waterTrappedAtCurrentIndex  = Math.min(maxValueOnLeft[i],maxValueOnRight[i])-height[i];
			ans+=waterTrappedAtCurrentIndex;
		}
		System.out.println(ans);
	}
	
	
}
