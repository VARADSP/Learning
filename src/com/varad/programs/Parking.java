package com.varad.programs;

import java.util.HashMap;

public class Parking{
	
	public static void solve(int[][] points){


		int countOfPoints = 0;
		HashMap<Double,Integer> slopeSameCount = new HashMap<Double,Integer>();
		
		for(int i=0;i<points.length;i++){
			
			int[] point = points[i];			
			int[] slopArr = new int[points.length-1];
			int slopeArrIndex=0;
			
			for(int k=0;k<points.length;k++){
				if(k!=i){
					int[] firstPoint = points[i];
					int[] secondPoint = points[k];
					double slope =  ((double)(secondPoint[1]-firstPoint[1])/(double)(secondPoint[0]-firstPoint[0]));	
					//double slope = (double )((points[k][1]-points[i][1])/(points[k][0]-points[i][0]));
					
					if(slopeSameCount.get(slope) != null){
						slopeSameCount.put(slope,slopeSameCount.get(slope)+1);
					}
					else{
						slopeSameCount.put(slope,1);
					}		   	
				}
			}
			
			int maxElementsHaveSameSlope = 0;
			for(double key : slopeSameCount.keySet()){
			     	int elements = slopeSameCount.get(key);
				if(elements > maxElementsHaveSameSlope){
					maxElementsHaveSameSlope = elements;
				}		
			}
					
			if(maxElementsHaveSameSlope >= countOfPoints){
				countOfPoints = maxElementsHaveSameSlope+1;
			}
			slopeSameCount.clear();
				
		}
		
		System.out.println(countOfPoints);


	}
public static void main(String args[]) {
	
	//solve(new int[][] {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}});
//	solve(new int[][] {{1,1},{2,2},{3,3}});
	
	solve(new int[][] {{0,1},{0,2},{0,3}});
		
}
}