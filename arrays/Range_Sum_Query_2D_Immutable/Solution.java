// Problem: Range Sum Query 2D Array- Immutable
// LeetCode: https://leetcode.com/problems/range-sum-query-2d-immutable/
// Difficulty: Medium



package arrays.Range_Sum_Query_2D_Immutable;
class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int rows=matrix.length+1;
        int cols=matrix[0].length+1;
        prefix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0){
                    prefix[i][j]=0;
                }
                else{
                    prefix[i][j]=matrix[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2+1][col2+1]-prefix[row2+1][col1]-prefix[row1][col2+1]+prefix[row1][col1];
    }
}