class Solution {
    public boolean isAnagram(String s, String t) {
        //We can use a hashmap<Char, Integer>. for first string we increment the integer, for second string we decrease the integer. Then we make sure all values are 0.

        //2. We sort the strings by ascii value and then see if they're equal
        if(s.length()!=t.length()){
            return false;
        }

        int[] numArray = new int[26];

        for (char c : s.toCharArray()) {
            numArray[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            numArray[c-'a']--;
        }

        for(int i : numArray) {
            if (i!=0) {
                return false;
            }
        }
         return true;
    }
}
