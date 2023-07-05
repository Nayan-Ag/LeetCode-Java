class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curr_prod = 1;
        
        for(int i=0;i<nums.length;i++){
            curr_prod*=nums[i];
            ans = Math.max(ans,curr_prod);
            if(curr_prod==0){
                curr_prod=1;
            }
        }
        curr_prod=1;
        for(int j=nums.length-1;j>=0;j--){
            curr_prod*=nums[j];
            ans = Math.max(ans,curr_prod);
            if(curr_prod==0){
                curr_prod=1;
            }
        }   
        return ans;
    }
}