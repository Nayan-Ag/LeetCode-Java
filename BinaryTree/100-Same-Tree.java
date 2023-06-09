// Ques: Given the roots of two binary trees p and q, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

// Input: p = [1,2,3], q = [1,2,3]
// Output: true
// Input: p = [1,2], q = [1,null,2]
// Output: false

//Code:
class Solution {
    boolean ans = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Same(p,q);
        return ans;
    }
    void Same(TreeNode p , TreeNode q){
        if(p ==null && q==null){
            return;
        }
        else if(p==null || q==null){
            ans = false;
            return;
        }
        if(p.val != q.val){
            ans = false;
        }
        Same(p.left , q.left);
        Same(p.right , q.right);
    }
}
