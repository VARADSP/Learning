//$Id$
package leetcodes;

import java.util.HashSet;

public class BinarySearch {
	  public static int lengthOfLongestSubstring(String s) {
		     HashSet<Character> set = new HashSet<Character>();   
		        
		     int p1 = 0;
		     int p2 = 0;
		     
		     int ans = 0;
		     int len = 0;
		        
		     while(p1<s.length() && p2<s.length()){
		        
		         if(!set.contains(s.charAt(p2))){
		            set.add(s.charAt(p2));
		            p2++;
		        }
		        else{
		            set.remove(s.charAt(p1));
		            p1++;
		        }
		         
		        len = Math.abs(p2-p1);
		        ans = Math.max(ans,len); 
		         
		     }   
		        
		     return ans;   
		    }
	
	 public static String reverseWords(String s) {
	        s = s.trim();
	        
	        String[] words = s.split(" ");
	        String res = "";
	        int idx = 0;
	        for(String s1 : words) {
	        	words[idx] = s1.trim();
	        	idx++;
	        }
	        
	        
	        for(int i=words.length-1;i>=0;i--){
	            if(i==0){
	                res+=words[i].trim();
	                continue;
	            }
	            res += words[i].trim() + " ";
	        }
	        
	        return res;
	    }
	 
	  public static int searchInsert(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length-1;
	        
	        while(start<=end){
	            int mid = start+(end-start)/2;
	            
	            if(target > nums[mid]){
	                start = mid+1;
	            }
	            else if(target < nums[mid]){
	                end = mid-1;
	            }
	            else{
	            	return mid;
	            }
	        }
	        
	        return start;
	    }
	  
	  public static void main(String[] args) {
		  System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
