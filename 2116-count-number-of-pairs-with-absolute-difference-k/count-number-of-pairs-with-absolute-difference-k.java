class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cs = 0; int cnt =0;

        for(int i=0; i<nums.length; i++) {
            int negrem = nums[i] - k;
            int posrem = nums[i] + k;

            if(map.containsKey(negrem)) {
                cnt = cnt + map.get(negrem);
            }

            if(map.containsKey(posrem)) {
                cnt = cnt + map.get(posrem);
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        return cnt;

        }

    }
