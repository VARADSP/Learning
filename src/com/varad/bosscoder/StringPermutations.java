//$Id$
package com.varad.bosscoder;

public class StringPermutations {
	
	public static void permute(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String ros = s.substring(0,i)+s.substring(i+1);
			permute(ros,ans+ch);
		}
	}
	
	 public static void printPermutations(String ques, String ans){
	        if(ques.length() == 0){
	            System.out.println(ans);
	            return;
	        }

	        for(int i = 0; i < ques.length(); i++){
	            char ch = ques.charAt(i);
	            String roq = ques.substring(0, i) + ques.substring(i + 1);
	            printPermutations(roq, ans + ch);
	        }
	 }
	  
	public static void main(String[] args) {
		String s = "abc";
		printPermutations(s, "");
	}
}
