class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftMost = leftPosition(nums, target);
        int rightMost = rightPosition(nums, target);

        return new int[] {leftMost, rightMost};
    }

     public int leftPosition(int nums[], int tar) {
        int st = 0, end = nums.length-1;
        int left = -1;
        while(st <= end) {
            int mid = st + (end - st)/2;

            if(nums[mid] == tar) {
                left = mid;
                end = mid -1;
            }
            else if(nums[mid] < tar) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return left;
      }

      public int rightPosition(int nums[], int tar) {
        int st = 0, end = nums.length-1;
        int right = -1;
        while(st <= end) {
            int mid = st + (end - st)/2;

            if(nums[mid] == tar) {
                right = mid;
                st = mid + 1;
            }
            else if(nums[mid] < tar) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return right;
      }
}