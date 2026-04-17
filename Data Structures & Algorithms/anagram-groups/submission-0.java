class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] letterFrequency = new int[26];
        // HashMap<int[],ArrayList<String>>() map = new HashMap<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for (String s : strs) {
            for (char c : s.toCharArray()) {
                letterFrequency[c-'a']++;
            }
            String keyString = Arrays.toString(letterFrequency);
            if(map.containsKey(keyString)){
                map.get(keyString).add(s);
            } else {
                map.put(keyString,new ArrayList<String>(List.of(s)));
            }
            letterFrequency = new int[26];
        }
        List<List<String>> results = new ArrayList<>();
        results.addAll(map.values());
        return results;
    }
}
