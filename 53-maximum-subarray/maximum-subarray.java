class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int maxSum = nums[0];

        for(int i=0; i<nums.length; i++) {
            cs = Math.max(cs + nums[i], nums[i]);
            maxSum = Math.max(maxSum, cs);
        }
        System.gc();
        return maxSum;
    }
}