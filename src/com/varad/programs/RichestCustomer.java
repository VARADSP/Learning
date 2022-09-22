//$Id$
package com.varad.programs;

public class RichestCustomer {
	
	public static int findMaxCustomer(int[][] ar) {
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			int m = 0;
			for(int j=0;j<ar[0].length;j++) {
				m+=ar[i][j];
			}
			if(m>ans) {
				ans=m;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		
	}

}
