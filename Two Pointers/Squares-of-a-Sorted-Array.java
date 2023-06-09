// Ques: Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Code: 
class Solution {
    public int[] sortedSquares(int[] nums) {
    int j = nums.length - 1;
    int i = 0;
    if(nums.length%2==1){
        nums[nums.length-1] = nums[nums.length-1]*nums[nums.length-1];
        j = nums.length-2;
    }
    while(i<j){
        nums[i] = nums[i] * nums[i];
        nums[j] = nums[j] * nums[j];
        j--;
        i++;
    }
     
    Arrays.sort(nums);
    return nums;   
    }
}
