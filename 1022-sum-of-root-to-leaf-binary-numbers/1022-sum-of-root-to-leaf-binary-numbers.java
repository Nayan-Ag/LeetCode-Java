/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return pathSumRootToLeaf(root, 0);
    }
    
    private int pathSumRootToLeaf(TreeNode root, int parentNodeSum){
        if(root == null) return 0;
        
        parentNodeSum = 2 * parentNodeSum + root.val;
        if(root.left == null && root.right == null){
            return parentNodeSum;
        }
        
        return pathSumRootToLeaf(root.left, parentNodeSum) + pathSumRootToLeaf(root.right, parentNodeSum);
    }
}