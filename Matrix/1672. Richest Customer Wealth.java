// Ques: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Code:
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0 ;
        int sum = 0 ;
        for(int i = 0 ; i<accounts.length ; i++){
            for(int j = 0 ; j< accounts[i].length ; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > ans){
                ans = sum;
                sum = 0;
            }
            sum = 0;
        }
        return ans;
    }
}
