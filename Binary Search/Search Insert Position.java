// Ques: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// Code:
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid=0;
        if(nums[high]<target){
            return (high+1);
        }
        if(nums[0]>target){
            return (0);
        }
        while(low<=high){
            mid = (int)Math.floor((low+high)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
            if(nums[mid]<target){
                low = mid+1;
            }
        }
        return low;
    }
}
