package com.varad.datastructures.sorting;

public class StreetLamps {

	public static void solve(int days,int[] streetLamps) {
		
		
		for(int i=0;i<days;i++) {
		
			int[] previousState = new int[8];
			for(int s=0;s<streetLamps.length;s++) {
				previousState[s] = streetLamps[s];
			}
			
			for(int j=0;j<streetLamps.length;j++) {
				
				if(j==0) {
					if(previousState[j+1] == 1) {
						streetLamps[j] = 1;
					}
					else {
						streetLamps[j] = 0;
					}	
					continue;
				}
				
				if(j==streetLamps.length-1) {
					if(previousState[j-1] == 1) {
						streetLamps[j] = 1;
					}
					else {
						streetLamps[j] = 0;
					}
					continue;
				}
				
				if(previousState[j-1] == previousState[j+1]) {
					streetLamps[j]=0;
				}
				else {
					streetLamps[j]=1;
				}
				
			}
			
		}
		
		for(int l=0;l<streetLamps.length;l++) {
			System.out.print(streetLamps[l] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		int days = 2;
		int streetLamps[] = {1,1,1,0,1,1,1,1};
		
		solve(days,streetLamps);
	
	}
	
}
