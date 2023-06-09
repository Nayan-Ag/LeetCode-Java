// Ques: Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// Code:
class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int mid = 0;
        int ans = nums[nums.length-1];
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]>nums[low]){
                if(nums[low]<ans){
                    ans = nums[low]; 
                }
                low = mid+1;
            }

            else{
                if(nums[mid]<ans){
                    ans = nums[mid]; 
                }
                if(nums[high]<ans){
                    ans = nums[high]; 
                }
                high = mid-1;
            }
        }
        return ans;
    }
}
