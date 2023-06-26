// Ques: You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// Code: 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length-1;
        boolean ans = false;
        while(i<=j){
            int mid = (i+j)/2;
            System.out.println(mid);
            if( (matrix[mid][0] <= target) && (matrix[mid][matrix[0].length-1]>=target)){
                int a=0;
                int b=matrix[mid].length-1;
                while(a<=b){
                    int midin = (a+b)/2;
                    if(matrix[mid][midin]==target){
                        return true;
                    }
                    else if(matrix[mid][midin]<target){
                        a = midin+1;
                    }
                    else{
                        b = midin-1;
                    }
                }
            return false;
            }
            else if(matrix[mid][0]<target){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
}
