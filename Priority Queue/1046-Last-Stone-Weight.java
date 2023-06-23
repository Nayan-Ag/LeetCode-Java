// Ques: You are given an array of integers stones where stones[i] is the weight of the ith stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the weight of the last remaining stone. If there are no stones left, return 0.

// Code:
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heapm = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<stones.length ; i++){
            heapm.add(stones[i]);
        }
        for(int i=0 ; i<stones.length ; i++){
            if(heapm.isEmpty()){
                return 0;
            }
            int hi = heapm.peek();
            heapm.poll();
            if(heapm.isEmpty()){
                return hi;
            }
            int lo = heapm.peek();
            heapm.poll();
            if(hi!=lo){
                heapm.add(hi-lo);
            }
        }
        if(heapm.isEmpty()){
        return 0;
        }
        return heapm.poll();
    }
}
