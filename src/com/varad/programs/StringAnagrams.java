package com.varad.programs;

public class StringAnagrams {

	
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

    	int numberOfCharactes = 0;
    	
    	int[] string1 = new int[26];
    	int[] string2 = new int[26];
    	

    	for(int i=0;i<a.length();i++) {
    		string1[a.charAt(i)-'a'] +=1;
    		
    	}
    	for(int i=0;i<b.length();i++) {
    		string2[b.charAt(i)-'a'] +=1;
    	}
    	
    	for(int i=0;i<string1.length;i++) {
    		if(string1[i] != string2[i]) {
    			numberOfCharactes+=Math.abs(string1[i]-string2[i]);
    		}
    	}
    	
    	
    	return numberOfCharactes;
    }

	
	public static void main(String[] args) {
		
		
		System.out.println("Number of characters = " + 
		
				makeAnagram("abc", "cde")
				);
		
		
		
		
		
	}
}
