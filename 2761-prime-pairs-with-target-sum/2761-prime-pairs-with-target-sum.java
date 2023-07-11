class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        
        for(int i=2;i<=n;i++){
            if(arr[i] == true){
                for(int j=2*i ; j<=n ; j +=i) {
                    arr[j] = false;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        int a = 2;
        int b = n;
        while(a<=b){
            if(arr[a]==false && arr[b]==false){
                a++;
                b--;
            }
            else if(arr[a]==false)a++;
            else if(arr[b]==false)b--;
            
            else if((a+b)==n){
                List<Integer> sublist = new ArrayList<>();
                sublist.add(a);
                sublist.add(b);
                list.add(sublist);
                a++;
                b--;
            }
            else if((a + b)<n) a++;
            else b--;
        }
        return list;
    }
}