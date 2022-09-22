//$Id$
package com.varad.bosscoder;

public class RectangleOverlap {
	
	
	public static boolean checkIfLiesInside(int[] rec1 , int[] rec2) {
//		if(!(rec1[0] > rec2[0] && rec1[0] < rec2[2] && rec1[1] > rec2[1] && rec1[1] < rec2[3])) {			
//			return true;
//		}
//		return false;

		return rec1[0] < rec2[2] && rec1[1]<rec2[3] && rec1[2]>rec2[0] && rec1[3]>rec2[1];
	}
	
	public static void main(String[] args) {
		
		int[] rec1 = {0,0,1,1};
		int[] rec2 = {1,0,2,1};
		System.out.println(checkIfLiesInside(rec1, rec2));
		
		
	}
}
