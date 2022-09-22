//$Id$
package leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	
	  static int ans = Integer.MAX_VALUE;
	    static int diff = Integer.MAX_VALUE;
	    public static int threeSumClosest(int[] nums, int target) {
	        helper(nums,target,0,0,0);
	        return ans;
	    }
	    
	    
	    public static int threeSumClosest2(int[] nums, int target) {
	        
	    	  List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	    	   
	         Arrays.sort(nums);
	        int closest_sum=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length-2;i++){
	            int left=i+1;
	            int right=nums.length-1;
	            while(left<right){
				// comparing the sum of three numbers to the 'target' can cause overflow. So, we will try to find a target difference
	                int difference = target-nums[i]-nums[left]-nums[right];
	                if(difference==0) return target; //  we've found a triplet with an exact sum, so we return sum of all the numbers
	            // the second part of the above 'if' is to handle the smallest sum when we have more than one solution
				   if((Math.abs(difference)==Math.abs(closest_sum) && difference>closest_sum)
	                  || Math.abs(difference)<Math.abs(closest_sum)){
	                    closest_sum=difference; // save the closest and the biggest difference  
	                }
	                if(difference>0) left++; // we need a triplet with a bigger sum
	                else right--; // we need a triplet with a smaller sum
	            }
	        }
	        return target-closest_sum;
	        
	        
	    }
	   
	    
	    public static void helper(int[] nums,int target,int sum,int size,int index){
	        if(index == nums.length){
	        	if(size == 3){
		            if(Math.abs(target-sum)<=diff){
		                ans = sum;
		                diff = Math.abs(target-sum);
		            }
		        }
	            return;
	        }
	        if(size == 3){
	            if(Math.abs(target-sum)<=diff){
	                ans = sum;
	                diff = Math.abs(target-sum);
	            }
	        }
	        
	        helper(nums,target,sum+nums[index],size+1,index+1);
	        helper(nums,target,sum,size,index+1);
	        
	    }
	    
	    public static void main(String[] args) {
		
	    	
	    	int[] nums = {1,1,-1};
	    	System.out.println(threeSumClosest2(nums, 1));
	    	
	    }
	    
}
