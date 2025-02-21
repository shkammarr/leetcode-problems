class Solution {
    public int rearrangeCharacters(String s, String target) {
          HashMap<Character, Integer> freqS = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqS.put(c, freqS.getOrDefault(c, 0) + 1);
        }

        // Step 2: Count the frequency of characters in `target`
        HashMap<Character, Integer> freqTarget = new HashMap<>();
        for (char c : target.toCharArray()) {
            freqTarget.put(c, freqTarget.getOrDefault(c, 0) + 1);
        }

        // Step 3: Calculate the max number of full copies
        int maxCopies = Integer.MAX_VALUE;
        for (char c : target.toCharArray()) {
            if (!freqS.containsKey(c)) {
                return 0; // If a character in `target` is missing, we can't make any copies
            }
            int available = freqS.get(c);
            int needed = freqTarget.get(c);
            maxCopies = Math.min(maxCopies, available / needed);
        }

        return maxCopies;
    }
}