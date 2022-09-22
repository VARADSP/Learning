//$Id$
package com.varad.bosscoder;

class NumMatrix {
    int[][] prefixSum;
    public NumMatrix(int[][] matrix) {
             prefixSum = new int[matrix.length][matrix[0].length];
             for(int i=0;i<matrix.length;i++){
                 for(int j=0;j<matrix[0].length;j++){
                     if(i==0 && j==0){ 
                        prefixSum[i][j] =  matrix[i][j];
                     }
                     else if(i==0 && j>0){
                         prefixSum[i][j] = prefixSum[i][j-1]+matrix[i][j]; 
                     }
                     else if(i>0 && j==0){
                         prefixSum[i][j] = prefixSum[i-1][j]+ matrix[i][j];
                     }
                     else{
                         prefixSum[i][j] = prefixSum[i][j-1]+prefixSum[i-1][j]-prefixSum[i-1][j-1]+matrix[i][j];
                     }
                }
             }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
            int ans = prefixSum[row2][col2];
            if(row1>0){
                ans -= prefixSum[row1-1][col2];
            }
        
            if(col1>0){
                ans-=prefixSum[row2][col1-1];
            }
            if(row1>0 && col1>0){
                ans+=prefixSum[row1-1][col1-1];
            }
        
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

public class RangeSum2D {

	
	public static void main(String[] args) {
		
		
		int[][] mat = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
		
		
		NumMatrix matrix = new NumMatrix(mat);
		
		System.out.println(matrix.sumRegion(2, 1, 4, 3));
	}
}
