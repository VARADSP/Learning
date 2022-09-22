//$Id$
package com.varad.bosscoder;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int[] point;
    int len;
    int distance;
    Pair(int[] point,int len,int distance){
        this.point=point;
        this.len=len;
        this.distance=distance;
    }
    public int compareTo(Pair o){
        return this.distance - o.distance;
    }
}

public class NearestExit {
    
	
	
	
	static int ans = Integer.MAX_VALUE;
    public static int nearestExitUsingRecursion(char[][] maze, int[] entrance) {
        helper(maze,entrance[0],entrance[1],entrance[0],entrance[1],new boolean[maze.length][maze[0].length]);
        return ans;
    }
    
    public static void helper(char[][] maze,int row,int col,int or,int oc,boolean[][] visited){
        
        if(row > maze.length-1 || col > maze[0].length-1 || row<0 || col<0 ||  maze[row][col] == '+' || visited[row][col]==true){
            return;
        }

        if(row == maze.length-1 || col == maze[0].length-1 || row==0 || col ==0 && (row != or && col != oc)){
            ans = Math.min(ans,Math.abs(Math.abs(or-row) + Math.abs(oc-col)));
            return;
        }
        
        visited[row][col] = true;
        helper(maze,row-1,col,or,oc,visited);
        helper(maze,row+1,col,or,oc,visited);
        helper(maze,row,col-1,or,oc,visited);
        helper(maze,row,col+1,or,oc,visited);
        visited[row][col] = false;
	    }
    
    
    public static int nearestExit(char[][] maze, int[] entrance) {
        int min=Integer.MAX_VALUE;
        
        //Dimensions
        int m=maze.length;
        int n=maze[0].length;
        int distance;
        
        //Directions
        int[][] dir = {{0, -1}, {-1, 0},{0, 1},{1, 0}};
        
        //Min heap that will be constructed Using the theortical distance
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        
        //Add the exits to our priorty queue with the theortical distance
		//If an exit is also an entrance don't enter it.
        for(int i=0;i<m;i++){
           if(maze[i][0]=='.'&& (entrance[0]!=i || entrance[1]!=0)){
               distance=Math.abs(i-entrance[0])+Math.abs(0-entrance[1]);
               pq.add(new Pair(new int[]{i,0},0,distance));
           }
            if(maze[i][n-1]=='.' && (entrance[0]!=i || entrance[1]!=n-1)){
                distance=Math.abs(i-entrance[0])+Math.abs((n-1)-entrance[1]);
                pq.add(new Pair(new int[]{i,n-1},0,distance));
           }
        }
        for(int j=1;j<n-1;j++){
            if(maze[0][j]=='.' && (entrance[0]!=0 || entrance[1]!=j)){
               distance=Math.abs(0-entrance[0])+Math.abs(j-entrance[1]);
               pq.add(new Pair(new int[]{0,j},0,distance)); 
            }
            if(maze[m-1][j]=='.' && (entrance[0]!=m-1 || entrance[1]!=j)){
                distance=Math.abs((m-1)-entrance[0])+Math.abs(j-entrance[1]);
                pq.add(new Pair(new int[]{m-1,j},0,distance));
                
            }
        }
        
        
        //Start exploring the exits starting from the one with the least theortical Distance
        Pair curPoint;
        while(!pq.isEmpty()){
            curPoint=pq.poll();
            int x=curPoint.point[0];
            int y=curPoint.point[1];
            //If the point we are exploring is the entrance then we found the minimum path 
            //Since other points will have higher distance anyway
            if(x==entrance[0] && y==entrance[1]) return curPoint.len;
            
            //Explore the 4 other directions 
            for(int[] r : dir){
                int i=r[0]+x;
                int j=r[1]+y;
                if(i<0 || j<0 || i>m-1 || j>n-1) continue;
                if(maze[i][j]=='.') {
                    distance=Math.abs(i-entrance[0])+Math.abs(j-entrance[1]);
                    pq.add(new Pair(new int[]{i,j},curPoint.len+1,curPoint.len+1+distance)); 
                    maze[i][j]='+';
                }
            }
        }
        //If I didn't find the entrance
        return -1;
    }
    
    public static void main(String[] args) {
    	
    	char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
    	int[] entrance = {1,0};
    	System.out.println(nearestExit(maze, entrance));
    	//String st = "v  s                   p";
    	//st = st.replaceAll("\\s+","");
    	//System.out.println(st);
	}
    
}
