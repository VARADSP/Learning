//$Id$
package com.varad.bosscoder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NextPermutations {
	
	public static TreeSet<Integer> permutations  = new TreeSet<Integer>();
	
	public static void nextPermutation(int[] nums) {
		int i = nums.length-2;
		
		while(i>=0 && nums[i]>=nums[i+1]) {
			i--;
			
			if(i>=0) {
				int j = nums.length-1;
				
				while(j>=0 && nums[j] <= nums[i]) {
					j--;
				}
				swap(nums,i,j);
				
			}
			
		}
		
		reverse(nums,i+1,nums.length-1);
	}
	
	public static void swap(int[] A,int i,int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	
	public static void reverse(int[] A , int i,int j) {
		while(i<j) {
			swap(A,i++,j--);
		}
	}
	public static void generatePerms(String s,String asf) {
		if(s.length()==0) {
			permutations.add(Integer.parseInt(asf));
		}
		
		for(int i=0;i<s.length();i++) {
			String ch = ""+s.charAt(i);
			String left = s.substring(0,i);
			String right = s.substring(i+1);
			
			generatePerms(left+right, asf+ch);
		}
	}
	
	public static TreeSet<Integer> getPerms(String s){
		TreeSet<Integer> perms = new TreeSet<Integer>();
		int n = s.length();
		int f = getFact(n);
		
		for(int i=0;i<f;i++) {
			StringBuilder sb = new StringBuilder(s);
			int temp = i;
			String perm = "";
			for(int div = n;div>=1;div--) {
				int q = temp/div;
				int r = temp%div;
				
				
				perm += sb.charAt(r);
				sb.deleteCharAt(r);
				
				temp = q;
			}
			perms.add(Integer.parseInt(perm));
		}
		
		
		return perms;
	}
	
	public static int getFact(int n) {
		if(n==0) {
			return 1;
		}
		
		return n*getFact(n-1);
	}
	
	public static void main(String[] args) {
		int[] input = {1,3,2};
		String s = "";
		for(int i=0;i<input.length;i++) {
			s+=input[i];
		}
		
		generatePerms(s, "");
		Integer i = Integer.parseInt(s);
		TreeSet<Integer> perms = getPerms(s);
		List<Integer> perms2 = new ArrayList<Integer>(perms);
		System.out.println(perms);
		System.out.println("Answer = " + perms2.get(perms2.indexOf(i)+1));
		
		nextPermutation(input);
		
		
	}
}
