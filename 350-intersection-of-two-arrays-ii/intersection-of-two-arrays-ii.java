class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        // sort second array
        Arrays.sort(nums2);
        // declare pointers
        int l = 0, r = 0;
        // declare array list to hold intersections
        List<Integer> list = new ArrayList<>();
        // loop until we reach end of one array
        while(l < nums1.length && r < nums2.length) {
            // take number from nums1 with left pointer
            int ln = nums1[l];
            // take number from nums2 with right pointer
            int rn = nums2[r];
            // check if left num is less than right then increment left pointer
            if(ln < rn) l++;
            // otherwise increment right pointer
            else if(ln > rn) r++;
            // if both nums are equals
            else {
                // add number to list
                list.add(ln);
                // increment left pointer
                l++;
                // increment right pointer
                r++;
            }
        }
        // use streams to conveert array list to int[] and return it
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}