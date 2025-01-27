class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int digValue = digitSum(nums[i]);

            if(map.containsKey(digValue)) {
                int pair = nums[i] + map.get(digValue);
                max = Math.max(max, pair);

                map.put(digValue, Math.max(map.get(digValue), nums[i]));
            }
            else {
                map.put(digValue, nums[i]);
            }
        }
        System.gc();
        return max;
    }

    public int digitSum(int num) {
        int x = num;
        int sum = 0;
        while(x!=0) {
         sum = sum + (x%10);
         x = x/10;
        }
        return sum;
    }
}