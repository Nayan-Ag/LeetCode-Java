// 1302. Deepest Leaves Sum

// Given the root of a binary tree, return the sum of values of its deepest leaves.

// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
// Output: 15

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }
        q.add(root);
        while(!q.isEmpty()){
            int levels = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0 ; i<levels;i++){
                if(q.peek().left !=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                sublist.add(q.poll().val);
            }
            list.add(sublist);
        }
        int sum = 0;
        List<Integer> ans = list.get(list.size() - 1);
        for(int i=0 ; i<ans.size() ; i++){
            sum += ans.get(i);
        } 
        return sum;
    }
}
