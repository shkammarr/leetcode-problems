class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : words) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        boolean centreUsed = false;
        int result = 0;

        for(String word : words) {
        String rev = new StringBuilder(word).reverse().toString();

        if(!rev.equals(word)) { //ab = ba here re is != wordv
            if((map.getOrDefault(word, 0) > 0) && (map.getOrDefault(rev, 0) > 0)) {
                map.put(word, map.get(word) - 1);
                map.put(rev, map.get(rev) - 1);
                result = result + 4; 
            } 
        }
        else { //aa = aa here reverse is = to word
            if(map.getOrDefault(word, 0) >= 2) {
                map.put(word, map.get(word) - 2);
                result = result + 4;
             }

            else if(map.get(word) == 1 && centreUsed == false) {
                map.put(word, map.get(word)-1);
                result = result + 2;
                centreUsed = true;
            }
        }
    }
    
    return result;
    }
}