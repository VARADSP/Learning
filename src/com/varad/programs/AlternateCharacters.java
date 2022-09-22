package com.varad.programs;

import java.util.ArrayList;

public class AlternateCharacters {

	
	
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int numberOfDeletions = 0;

        ArrayList<Character> ourString= new ArrayList<>();

        int previousOne = 0;
        ourString.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
        	
        	
            if(ourString.get(previousOne) == s.charAt(i)){
                numberOfDeletions++;
            }
            else{
                ourString.add(s.charAt(i));
                previousOne++;
            }

        }

        return numberOfDeletions;

    }
	
	
	public static void main(String[] args) {
		System.out.println("Required number of deletions "
				+ "   =  "
				+ alternatingCharacters("AABAAB"));
	}
}
