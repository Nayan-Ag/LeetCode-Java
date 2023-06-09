// Ques: You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

// A row i is weaker than a row j if one of the following is true:

// The number of soldiers in row i is less than the number of soldiers in row j.
// Both rows have the same number of soldiers and i < j.
// Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

// Code:
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<mat.length ; i++){
            int sum = 0;
            for(int j=0 ; j<mat[i].length ; j++){
                sum = sum + mat[i][j];
            }
            map.put(i,sum);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(n1,n2) ->{
            int fre1 = map.get(n1);
            int fre2 = map.get(n2);
            if(fre1!=fre2) return fre1-fre2;
            else return n1-n2;
        });
        int[] ans = new int[k];
        for(int i=0 ; i<k ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
