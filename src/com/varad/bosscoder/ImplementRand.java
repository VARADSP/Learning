//$Id$
package com.varad.bosscoder;

import java.util.Random;

public class ImplementRand {
	
	public static int rand7() {
		return new Random().nextInt()*7;
	}
	
	
	
	public static void main(String[] args) {
		
		int row = rand7();
		int col = rand7();
		
		int v = (row-1)*7+col;
		v = v % 7;
		System.out.println(v);
		//return v;
		
	}

}
