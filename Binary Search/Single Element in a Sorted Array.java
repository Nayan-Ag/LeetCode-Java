// Ques: You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.

// Code:
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(mid==0 || mid==nums.length-1){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1] && mid%2!=0){
                low = mid+1;
            }
            else if(nums[mid]==nums[mid+1] && mid%2!=0){
                high = mid-1;
            }
            else if(nums[mid]==nums[mid-1] && mid>0){
                high = mid-1;
            }
            else if(nums[mid]==nums[mid+1] && mid<nums.length-1){
                low = mid+1;
            }
            else{
                return nums[mid];
            }
        }
        return nums[mid];
    }
}
