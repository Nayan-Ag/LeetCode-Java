// Ques: An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

// Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

// Code:
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0 ; i<matrix.length ; i++){
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> set1 = new HashSet<>();
            for(int j=0 ; j<matrix.length ; j++){
                set.add(matrix[j][i]);
                set1.add(matrix[i][j]);
            }
            for(int k=1 ; k<=matrix.length ; k++){
                if(!set.contains(k) || !set1.contains(k)){
                    return false;
                }
            }
        }
        return true;
    }
}
