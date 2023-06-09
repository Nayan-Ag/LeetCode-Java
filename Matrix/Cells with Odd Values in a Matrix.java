// Ques: There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

// For each location indices[i], do both of the following:

// Increment all the cells on row ri.
// Increment all the cells on column ci.
// Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

// Code:

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i=0;i<indices.length;i++){
            for(int a=0;a<n;a++){
                arr[indices[i][0]][a] = arr[indices[i][0]][a] + 1;
            }
            for(int b=0;b<m;b++){
                arr[b][indices[i][1]] = arr[b][indices[i][1]] + 1;
            }
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}
