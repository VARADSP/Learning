package com.varad.hackerrank;

public class ReverseShuffleMerge {

	public static void getString(String str) {
		int n = str.length();
		int[] unused = new int[26];
		int[] used = new int[26];
		int[] required = new int[26];
		char[] res = new char[1000];
		int j=0;
		//filling array mapping char freq
		for(int i=0;i<str.length();i++) {
			unused[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++) {
			required[i] = unused[i]/2;
		}
		
		//last character
		char ch = str.charAt(str.length()-1);
		int ch_position = ch-'a';
		res[j++]=ch;
		unused[ch_position]--;
		used[ch_position]++;
		
		//rest of char
		//add -- required is smalled than press
		//ch smaller
		//ch bigger
		for(int i=n-2;i>=0;i--) {
			
			ch = str.charAt(i);
			
			ch_position = ch-'a';
			
			//check to add or not
			if(used[ch_position] < required[ch_position]) {
					//add char 
				if(ch > res[j-1]) {
					res[j++]=ch;
					unused[ch_position]--;
					used[ch_position]++;
				}
				else {
					//check bigger element
					while(j>0 && ch<res[j-1] && used[res[j-1]-'a']-1+
							unused[res[j-1]-'a'] >= required[res[j-1]-'a']) {
						used[res[--j]-'a']--;
						
					}
					res[j++]=ch;
					unused[ch_position]--;
					used[ch_position]++;
				}
			}
			else {
				//rejecting the particular character
				unused[ch_position]--;
			}
		}
		
		for(int i=0;i<n/2;i++) {
			System.out.print(res[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getString("eggegg");
	}

}
