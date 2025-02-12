class Solution {
    public int subarraySum(int[] arr, int k) {
        int cs = 0; int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            cs = cs + arr[i];
            int ans = cs - k;
            
             if (cs == k) {
                cnt++;
            }
            
            if(map.containsKey(ans)) {
                cnt = cnt + map.get(ans);
            }
            map.put(cs, map.getOrDefault(cs, 0)+1);
        }
        
        return cnt;
    }
}