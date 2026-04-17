class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m= new HashMap<>();
        int difference;
        for (int i = 0; i< nums.length; i++) {
            
            if (m.containsKey(nums[i])){
                return(new int[]{m.get(nums[i]),i});
            }
            m.put(target-nums[i],i);
        }
        // for (int i = 0; i <nums.length-1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if((nums[i]+nums[j])==target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        return new int[0];
    }
}
