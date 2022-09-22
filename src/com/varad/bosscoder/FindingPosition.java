//$Id$
package com.varad.bosscoder;

public class FindingPosition {

	public static void main(String[] args) {
		int n = 9 ;
		int count = 0;
		while(n!=1) {
			count++;
			n/=2;
		}
		System.out.println(Math.pow(2, count));
	}
}
