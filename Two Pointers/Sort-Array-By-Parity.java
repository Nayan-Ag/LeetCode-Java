// Ques: Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

// Code:
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0 ; 
        int j=nums.length-1 ;
        while(i<j){
            if(nums[i]%2!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            else if(nums[j]%2==0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++; 
            }
            else if(nums[i] %2==0){
                i++;
            }
            else if(nums[j] %2!=0){
                j--;
            }
        }
        return nums;
    }
}
