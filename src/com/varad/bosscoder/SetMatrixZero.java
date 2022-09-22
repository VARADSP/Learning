//$Id$
package com.varad.bosscoder;

public class SetMatrixZero {
	
	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,0},{1,1,1,1},{1,1,1,1}};
		boolean rowMarker = false;
		boolean colMarker = false;
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		
		for(int i=0;i<cols;i++) {
			if(matrix[0][i] == 0) {
				rowMarker = true;
				break;
			}
		}
		
		
		for(int i=0;i<rows;i++) {
			if(matrix[i][0] == 0) {
				colMarker = true;
				break;
			}
		}
		
		
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				
				if(matrix[i][j] == 0) {
					matrix[0][i] = 0;
					matrix[j][0] = 0;
				}
				
			}
		}
		
		
		for(int i=1;i<cols;i++) {
			if(matrix[0][i] == 0) {
					for(int j=1;j<rows;j++) {
						matrix[j][i]=0;
					}
			}
		}
		
		
		for(int i=1;i<rows;i++) {
			if(matrix[i][0] == 0) {
					for(int j=1;j<cols;j++) {
						matrix[i][j]=0;
					}
			}
		}
		
		if(rowMarker) {
			for(int i=0;i<cols;i++) {
				matrix[0][i] = 0;
			}
		}
		
		if(colMarker) {
			for(int i=0;i<rows;i++) {
				matrix[i][0]=0;
			}
		}
		
		display(matrix);
		
	}
	
	
	public static void display(int[][] mat) {
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
