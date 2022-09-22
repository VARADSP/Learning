//$Id$
package com.varad.bosscoder;
import java.util.*;

public class WordLadder {
	
	public static int ladderLengthBrute(String start, String end, HashSet<String> dict) {
		int len = 0;
		HashSet<String> visited = new HashSet<String>();
		for (int i = 0; i < start.length(); i++) {
			char[] startArr = start.toCharArray();
			for (char c = 'a'; c <= 'z'; c++) {
				if (c == start.toCharArray()[i]) {
					continue;
				}
				startArr[i] = c;
				String temp = new String(startArr);
				if (dict.contains(temp)) {
					len++;
					start = temp;
					if (temp.equals(end)) {
						return len;
					}
				}
			}
		}
		return len;
	}
	
	  public static int longestValidParentheses(String S) {
	        Stack<Integer> st = new Stack<>();
	        int len = 0;
	        st.push(-1);
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)=='('){
	                 st.push(i);
	                }
	            else{
	                st.pop();
	                if(st.isEmpty()){
	                    st.push(i);
	                }
	                else{
	                    int m = i-st.peek();
	                    len= Math.max(m,len);
	                }
	            }
	        }
	        return len;
	    }
	

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList);
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet();
        queue.add(beginWord);
        visited.add(beginWord);
        int level = 0;
        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; size--) {
                String word = queue.poll();
                if (word.equals(endWord))
                    return level + 1;
                char[] ch = word.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    char backup = ch[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        ch[i] = c;
                        String nextWord = String.valueOf(ch);
                        if (!visited.contains(nextWord) && wordSet.contains(nextWord)) {
                            queue.add(nextWord);
                            visited.add(nextWord);
                        }
                    }
                    ch[i] = backup;
                }
            }
            level++;
        }
        return 0;
    }
	
	public static void optionalParamsTryOut(String... x) {
		  if(x.length > 0){
		        System.out.println(x[0]);            
		        }
		  System.out.println("bye");
	}

	public static void main(String[] args) {
		optionalParamsTryOut("helloasfasdasd");  
	    optionalParamsTryOut();
//		ArrayList<String> dict = new ArrayList<String>();
//		dict.add("hot");
//		dict.add("dot");
//		dict.add("lot");
//		dict.add("log");
//		dict.add("cog");
//		int ans = ladderLength("hit", "cog", dict);
//		System.out.println(longestValidParentheses("(())))"));
//		System.out.println(ans);
	}
}
