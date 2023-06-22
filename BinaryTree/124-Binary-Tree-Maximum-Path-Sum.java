//Ques: A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

//The path sum of a path is the sum of the node's values in the path.

//Given the root of a binary tree, return the maximum path sum of any non-empty path.

//Input: root = [1,2,3]
//Output: 6
//Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return max;
    }
    int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(sum(root.left) , 0);
        int right = Math.max(sum(root.right) , 0);
        max = Math.max(max , root.val + left + right);

        return (root.val + Math.max(left , right));
    }
}
