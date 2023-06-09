// Ques: Given the root of a binary tree, return the preorder traversal of its nodes' values.

// Input: root = [1,null,2,3]
// Output: [1,2,3]

// Code:
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        traversal(root,result);
        return result;
    }
    public void traversal(TreeNode root , List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        traversal(root.left , res);
        traversal(root.right , res);
    }
}
