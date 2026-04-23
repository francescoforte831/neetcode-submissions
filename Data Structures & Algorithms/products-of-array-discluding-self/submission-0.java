class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        result[0] = 1;
        int left = 1;
        for (int i = 1; i < numsLength; i++) {
            left*= nums[i-1];
            result[i] = left;
        }

        int right = 1;
        for (int i = numsLength-1; i>=0; i--) {
            result[i]*=right;
            right*=nums[i];
        }

        return result;



    
    
    
    }

}  
