class Solution {
    public int lengthOfLongestSubstring(String s) {
        //edge cases
        if (s == null || s.length() == 0) {
            return 0;
        } 

        //Initialize variables (pointers, return value of at least 1, HashSet for sliding window)
        int longestSubstring = 1;
        int left = 0;
        Set<Character> slidingWindow = new HashSet<>();

        //Sliding window loop. Outer moves right to expand, inner moves left to contract
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (slidingWindow.contains(current)) {
                slidingWindow.remove(s.charAt(left));
                left ++;
            }

            slidingWindow.add(current);
            longestSubstring = Math.max(longestSubstring,right - left + 1);
        }

        return longestSubstring;
    }
}
