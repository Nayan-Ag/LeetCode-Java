// Ques: Given a binary tree, determine if it is height-balanced.

// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false

// Code:
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(height(root)==-1) return false;
        return true;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left) ;
        int right = height(root.right) ;
        if(left==-1 || right==-1 || Math.abs(left-right)>1) return -1;
        return (Math.max(height(root.left) , height(root.right) )+ 1);
    }
}
