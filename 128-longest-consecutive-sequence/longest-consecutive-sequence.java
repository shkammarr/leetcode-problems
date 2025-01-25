class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
     int cnt = 1;
     int max = 0;

    for(int no : nums) {
        set.add(no);
        }

    for(int num : set) {
        if(!set.contains(num - 1)) {
        int x = num;
        cnt = 1;
            while (set.contains(x + 1)) {
                cnt++;
                x++;
            }
        }
        max = Math.max(max, cnt);
      }
    return max;
    }
}
