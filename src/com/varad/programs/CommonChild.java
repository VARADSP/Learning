package com.varad.programs;

import java.util.HashMap;

public class CommonChild {

	
	
	// Complete the commonChild function below.
    static int commonChild(String s1, String s2,int n,int m , int[][] solutions) {

//    	int[] charArr1 = new int[26];
//    	int[] charArr2 = new int[26];
//    	
//    	
//    	for(int i=0;i<s1.length();i++) {
//    		charArr1[s1.charAt(i) - 'A']++;
//    	}
//    	for(int i=0;i<s2.length();i++) {
//    		charArr2[s2.charAt(i) - 'A']++;
//    	}
//    	
//    	Integer longestCommon = 0;
//    	for(int i=0;i<charArr1.length;i++) {
//    		if(charArr1[i] == charArr2[i]) {
//    			longestCommon+=charArr1[i];
//    		}
//    	}
//    	return longestCommon;
//    	
//    	
//    	for(int i=0;i<s1.length();i++) {
//    		Character c = s1.charAt(i);
//    		String commonSubString = ""; 
//    		for(int j=0;j<s2.length();j++) {
//    			if(c == s2.charAt(j)) {
//    				commonSubString+=s2.charAt(j);
//    				break;
//    			}
//    		}
//    	}
//    	
    	
    	if(solutions[n][m] != -1) {
    		return solutions[n][m];
    	}
    	
    	if(n==0 || m==0) {
    		return 0;
    	}
    
    	if(s1.charAt(n) == s2.charAt(m)) {
    		return 1 + commonChild(s1, s2, m-1, n-1,solutions);
    	}
    	else {
    		int temp1 = commonChild(s1, s2, n, m-1,solutions);
    		int temp2 = commonChild(s1, s2, n-1, m,solutions);
    		solutions[n][m] = Math.max(temp1, temp2);
    		return Math.max(temp1, temp2);
    	}
    }

    
    public int child(String str1, String str2){
        int L[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                if(i==0 || j==0)
                    L[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    L[i][j] = L[i-1][j-1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        return L[str1.length()][str2.length()];
    }
	
	public static void main(String[] args) {
        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        int[][] arr = new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++) {
        	for(int j=0;j<s2.length();j++) {
        		arr[i][j] = -1;
        	}
        }
        int result = commonChild(s1, s2,s1.length()-1,s2.length()-1,arr);
        System.out.println(result);
	}
}
