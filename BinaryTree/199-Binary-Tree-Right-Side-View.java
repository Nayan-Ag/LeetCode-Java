// Ques: Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

// Input: root = [1,2,3,null,5,null,4]
// Output: [1,3,4]

// Code:
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> finalans = new ArrayList<Integer>();
        right(root , finalans , 0);
        return finalans;
    }
    void right(TreeNode root , List<Integer> list , int level){
        if(root == null){
            return;
        }
        if(list.size() == level){
            list.add(root.val);
        }
        right(root.right , list , level+1);
        right(root.left , list , level+1);
    }
}
