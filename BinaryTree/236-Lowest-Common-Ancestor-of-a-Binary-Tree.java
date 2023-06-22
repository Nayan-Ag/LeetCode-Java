// Ques: Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

// Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
// Output: 3
// Explanation: The LCA of nodes 5 and 1 is 3.

// Code:
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null || p == root || q == root)        
    return root;
      
    TreeNode right = lowestCommonAncestor(root.right , p , q);
    TreeNode left = lowestCommonAncestor(root.left , p , q); 
      
    if(right == null) return left;                   
    if(left == null) return right;
      
    else return root;      
    }
}
