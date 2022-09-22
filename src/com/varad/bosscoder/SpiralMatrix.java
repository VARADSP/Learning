//$Id$
package com.varad.bosscoder;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int n = 3;
		
		int sq = n*n;
		int[][] mat = new int[n][n];
		
		
		int idx = 1;
		int startRow = 0;
		int startCol = 0;
		int endCol = n-1;
		int endRow = n-1;
		
		
		while(idx <= sq) {
			
			for(int j=startCol,i=startRow;j<= endCol;j++) {
				mat[i][j]=idx++;
			}
			
			for(int j=endCol,i=startRow+1;i<= endRow;i++) {
				mat[i][j]=idx++;
			}
			
			for(int j=endCol-1,i=endRow;j>= startCol;j--) {
				mat[i][j]=idx++;
			}
			
			for(int j=startCol,i=endRow-1;i> startRow;i--) {
				mat[i][j]=idx++;
			}
			
			startRow++;
			startCol++;
			endCol--;
			endRow--;
			
		}
		
		for(int i1=0;i1<mat.length;i1++) {
			for(int j1=0;j1<mat[0].length;j1++) {
				System.out.print(mat[i1][j1] + " ");
			}
			System.out.println();
		}
	
	}
}
