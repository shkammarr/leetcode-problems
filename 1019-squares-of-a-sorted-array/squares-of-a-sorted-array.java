class Solution {
    public int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int st = 0; int end = nums.length -1;
        int i = nums.length -1;

        while(st <= end) {
            if(Math.abs(nums[st]) > Math.abs(nums[end])) {
             result[i--] = (nums[st] * nums[st]);
             st++;
            } else {
             result[i--] = (nums[end] * nums[end]);
             end--;
            }
        }
        System.gc();
        return result;
    }
}