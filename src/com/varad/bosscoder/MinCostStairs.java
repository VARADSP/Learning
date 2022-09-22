//$Id$
package com.varad.bosscoder;

public class MinCostStairs {
	 public static int minCostClimbingStairs(int[] cost) {
         
	        int minCost1 = 0, minCost2 = 0, i = 0;
	        
	        while (i < cost.length) {
	            int minCost = cost[i] + Math.min(minCost1, minCost2);
	            minCost2 = minCost1;
	            minCost1 = minCost;
	            ++i;
	        }
	        
	        return Math.min(minCost1, minCost2);
	    }
	 
	 public static int minCostClimbingStairs2(int[] cost) {
	        int[] minCost = new int[cost.length];
	        int n=cost.length;
	        minCost[0]=0;
	        minCost[1]=0;
	        
			for( int i=2; i< n; i++){
	            minCost[i]= Math.min(cost[i-1]+minCost[i-1],cost[i-2]+minCost[i-2]);
	        }
	        return Math.min(cost[n-1]+minCost[n-1],cost[n-2]+minCost[n-2]);
	    }
	 
	 public static void main(String[] args) {
		
		 minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1});
		 
		 minCostClimbingStairs2(new int[] {1,100,1,1,1,100,1,1,100,1});
		 
		 
	}
}
