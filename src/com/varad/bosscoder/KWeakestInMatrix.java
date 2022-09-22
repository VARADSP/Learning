//$Id$
package com.varad.bosscoder;

import java.util.PriorityQueue;

public class KWeakestInMatrix {
	    
	    static class Pair implements Comparable<Pair>{
	        int index;
	        int soldiers;
	        
	        Pair(int index,int soldiers){
	            this.index = index;
	            this.soldiers = soldiers;
	        }
	        
	         public int compareTo(Pair o){
	         return o.soldiers - this.soldiers;
	      }
	    }
	    
	    
	    
	    
	    
	    public static int[] kWeakestRows(int[][] mat, int k) {
	        
	        PriorityQueue<Pair> pq = new PriorityQueue<>();
	      
	        
	        for(int i=0;i<mat.length;i++){
	            int countOfSoldiers = 0;
	            for(int j=0;j<mat[0].length;j++){
	                
	                if(mat[i][j] == 1){
	                    countOfSoldiers++;
	                }
	                else{
	                    break;
	                }
	            }
	            
	            if(pq.size()==k){
	                if(pq.peek().soldiers>countOfSoldiers){
	                    Pair p = new Pair(i,countOfSoldiers);
	                    pq.remove();
	                    pq.add(p);
	                }
	            }
	            else{
	                Pair p = new Pair(i,countOfSoldiers);
	                pq.add(p);
	            }
	        }
	        int[] ans = new int[k];
	        int idx = 1;
	        int soldi = pq.peek().soldiers;
	        ans[ans.length-1] = pq.poll().index;
	        while(pq.size()>0){
	            if(pq.peek().soldiers == soldi) {
	            	if(ans[ans.length-idx-1+1] < pq.peek().index ) {
	            		int temp = ans[ans.length-idx-1+1];
	            		ans[ans.length-idx-1+1] = pq.peek().index;
	            		ans[ans.length-idx-1] = temp;
	            	}
	            	else {
	               	 ans[ans.length-idx-1] = pq.peek().index; 	    		
	            	}
	            	pq.remove();
	            }
	            else {
	            	 ans[ans.length-idx-1] = pq.poll().index; 	
	            }
	            idx++;
	        }
	        
	        return ans;
	    }
	
	    
	    public static void main(String[] args) {
			for(int i : kWeakestRows(new int[][] {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3)) {
				System.out.println(i);
			}
		}
}
