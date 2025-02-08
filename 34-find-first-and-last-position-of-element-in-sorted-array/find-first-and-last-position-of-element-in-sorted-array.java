class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = leftSearch(nums, target);
        int right = rightSearch(nums, target);

        System.gc();
        return new int[]{left, right};
    }

    public int leftSearch(int nums[], int target) {
        int leftAns = -1;
        int st= 0; int end = nums.length-1; 
        while(st <= end) {
            int mid = (st + end)/2;

            if(nums[mid] == target) {
                leftAns = mid;
                end = mid - 1;
            }

            else if(nums[mid] < target) {
                st = mid + 1;
            }
            
            else end = mid - 1;
        }
        return leftAns;
    }

    public int rightSearch(int nums[],int target) {
        int rightAns = -1;
        int st= 0; int end = nums.length-1; 
        while(st <= end) {
            int mid = (st + end)/2;

            if(nums[mid] == target) {
                rightAns = mid;
                st = mid + 1;
            }

            else if(nums[mid] < target) {
                st = mid + 1;
            }
            
            else end = mid - 1;
        }
        return rightAns;
    }

}