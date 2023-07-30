class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        int[] dp = new int[n];
        dp[n-1] = nums[n-1];
        for(int i=n-2 ; i>=1 ; i--){
            if(i==n-2) dp[i] = Math.max(nums[i] , dp[i+1]);
            else{
                dp[i] = Math.max(nums[i]+dp[i+2] , dp[i+1]);
            }
        }

        int[] dp2 = new int[n];
        dp2[n-2] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            if(i==n-2) dp2[i] = Math.max(nums[i] , dp2[i+1]);
            else{
                dp2[i] = Math.max(nums[i]+dp2[i+2] , dp2[i+1]);
            }
        }
        for(int i=0 ; i<n ; i++) System.out.print(dp[i] + " ");
        System.out.println("");
        for(int i=0 ; i<n ; i++) System.out.print(dp2[i] + " ");
        return Math.max(dp[1] , dp2[0]);
        
    }
}