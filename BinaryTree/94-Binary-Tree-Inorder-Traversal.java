// Ques: Given the root of a binary tree, return the inorder traversal of its nodes' values.

// Input: root = [1,null,2,3]
// Output: [1,3,2]

// Code:
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root,result);

        return result;
    }
    public void traversal(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        traversal(root.left , res);
        res.add(root.val);
        traversal(root.right , res);
    }
}
