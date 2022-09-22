//$Id$
package com.varad.programs;

import java.util.ArrayList;
import java.util.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordBreakProblem {
	
	
	public static ArrayList<String> result = new ArrayList<String>();
	public static HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
	
	public static ArrayList<String> wordBreakSolve(String s, HashSet<String> dict) {
		if(dict.contains(s)) {
			result.add(s);
			return s;
		}
		
		for(int i=0;i<s.length();i++) {
			String word = s.substring(0,i);
			if(dict.contains(word)) {
				
			}
		}
	}

	public static boolean wordBreak2(String s, Set<String> dict) {
		
		int[] dp = new int[s.length()];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {		
				String word = s.substring(j, i+1);
				if(dict.contains(word)) {
					if(j>0) {
						dp[i] += dp[j-1];
					}
					else {
						dp[i] += 1;
					}
				}
			}
		}
		return dp[s.length()-1]>0;
	}
	
	
	public static List<String> wordBreakSecondPart(String s, Set<String> dict) {
		//create an array of ArrayList<String>
		List<String> dp[] = new ArrayList[s.length()+1];
		dp[0] = new ArrayList<String>();
		for(int i=0; i<s.length(); i++){
		if( dp[i] == null )
		continue;
		for(String word:dict){
		int len = word.length();
		int end = i+len;
		if(end > s.length())
		continue;
		if(s.substring(i,end).equals(word)){
		if(dp[end] == null){
		dp[end] = new ArrayList<String>();
		}
		dp[end].add(word);
		}
		}
		}
		List<String> result = new LinkedList<String>();
		if(dp[s.length()] == null)
		return result;
		
		ArrayList<String> temp = new ArrayList<String>();
		dfs(dp, s.length(), result, temp);
		return result;
		}
		public static void dfs(List<String> dp[],int end,List<String> result,
		ArrayList<String> tmp){
		if(end <= 0){
		String path = tmp.get(tmp.size()-1);
		for(int i=tmp.size()-2; i>=0; i--){
		path += " " + tmp.get(i) ;
		}
		result.add(path);
		return;
		}
		for(String str : dp[end]){
		tmp.add(str);
		dfs(dp, end-str.length(), result, tmp);
		tmp.remove(tmp.size()-1);
		}
		}
	

	public static List<String>[] wordBreak3(String s, Set<String> dict) {
		
		int[] dp = new int[s.length()];
		List<String>[] solution = new ArrayList[s.length()+1];
 		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {		
				String word = s.substring(j, i+1);
				if(dict.contains(word)) {
					if(j>0) {
						dp[i] += dp[j-1];
						solution[i].addAll(solution[j-1]);
					}
					else {
						dp[i] += 1;
						solution[i].add(word);
					}
				}
			}
		}
		return solution;
	}


	
	
	public static boolean wordBreak(String s, Set<String> dict) {
		return wordBreakHelper(s, dict, 0);
		}
	
	
		public static boolean wordBreakHelper(String s, Set<String> dict, int start){
		if(start == s.length())
		return true;
		for(String a: dict){
		int len = a.length();
		int end = start+len;
		//end index should be <= string length
		if(end > s.length())
		continue;
		if(s.substring(start, start+len).equals(a))
		if(wordBreakHelper(s, dict, start+len))
		return true;
		}
		return false;
		}
		
		
		public static void main(String[] args) {
//			Set<String> set  = new HashSet<String>();
//			set.add("leet");
//			set.add("code");
//			String s = "leetcode";
//			System.out.println(wordBreak(s, set));
//			System.out.println(wordBreak2(s, set));
//			
			
			String s2 = "catsanddog";
			Set<String> wordBreak2Set = new HashSet<String>();
			wordBreak2Set.add("cat");
			wordBreak2Set.add("cats");
			wordBreak2Set.add("and");
			wordBreak2Set.add("sand");
			wordBreak2Set.add("dog");			
			
			
//			System.out.println(wordBreak3(s2, wordBreak2Set));
			
			System.out.println(wordBreakSecondPart(s2, wordBreak2Set));
			
			
		}
	
	
}
