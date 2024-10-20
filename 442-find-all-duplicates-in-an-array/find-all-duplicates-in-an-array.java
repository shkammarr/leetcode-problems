class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;

            for(int i=0; i<n; i++) {
                if(set.contains(nums[i])) {
                    list.add(nums[i]);
                }
                set.add(nums[i]);
            }
            Collections.sort(list);
            return list;
        }
    }
