class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int x = 0; x<nums.length; x++) {
            if (!hs.add(nums[x])) {
                return true;
            }
        }
    return false; 
    }
    
}