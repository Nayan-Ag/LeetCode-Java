// Ques: Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// Code:
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0 ; i<k ; i++){
            minheap.add(nums[i]);
        }
        for(int i=k ; i<nums.length ; i++){
            if(minheap.peek()<nums[i]){
                minheap.poll();
                minheap.add(nums[i]);
            }
        }
        return minheap.peek();
    }
}
