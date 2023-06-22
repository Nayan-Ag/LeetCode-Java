// Ques: Given the root of a binary tree, return the postorder traversal of its nodes' values.

// Input: root = [1,null,2,3]
// Output: [3,2,1]

// Code:
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traversal(root,result);

        return result;
    }
    public void traversal(TreeNode root , List<Integer> res){
        if(root == null){
            return;
        }
        traversal(root.left , res);
        traversal(root.right , res);
        res.add(root.val);
    }
}
