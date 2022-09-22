//$Id$
package leetcodes;
import java.util.*;
public class FourSum {

	
	    
	    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
	    public static List<List<Integer>> fourSum(int[] nums, int target) {
	    	
	    	
	    	List<Integer> list = new ArrayList<Integer>();
	        helper(nums,target,0,0,0,list);
	            
	            return ans;
	    }
	    
	    public static void helper(int[] nums,int target,int index,int size,int sum,List<Integer> list){
	        if(index == nums.length){
	            if(size == 4){
	                if(sum==target){
	                    ans.add(list);
	                }
	            }
	            return;
	        }
	        
	        if(size == 4){
	                if(sum==target){
	                    ans.add(list);
	                }
	         }
	        
	        list.add(nums[index]);
	        helper(nums,target,index+1,size+1,sum+nums[index],list);
	        list.remove(nums[index]);
	        helper(nums,target,index,size,sum,list);
	        
	    }
	    
	    public static void main(String[] args) {
			
	    	System.out.println(fourSum(new int[] {1,0,-1,0,-2,2},0));
		}
	}


	
