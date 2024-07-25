class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j : nums) {
            if(i<1 || j > nums[i-1]) {
                nums[i] = j;
                i++;
            }
        }
        return i;
    }
}
