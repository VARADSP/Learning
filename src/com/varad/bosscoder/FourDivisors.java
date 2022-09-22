//$Id$
package com.varad.bosscoder;

import java.time.LocalDate;

public class FourDivisors {
	
	public static int getDivisors(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			int divisors=2;
			
			for(int i=1;i*i<n;i++) {
				if(n%i==0) {
					divisors++;
				}
			}
			
			return divisors;
		}
	}
	
	public static int[] getDivisors(int num,int divisors) {
		int[] divs = new int[divisors];
		int idx = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				divs[idx++] = i;
			}
		}
		
		return divs;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(LocalDate.of(2013, 8, 13).getDayOfWeek());
		
		int[] nums = {21,4,7};
		int ans = 0;
		
		for(int num : nums) {
			if(getDivisors(num) == 4) {
				ans=num;
				break;
			}
		}
		System.out.println("ans =" +  ans);
		if(ans == 0) {
			System.out.println(0);
		}
		
		int sum =0;
		for(int i : getDivisors(ans, 4)) {	
			sum +=i;
		}
		
		System.out.println(sum);
		
	}

}
