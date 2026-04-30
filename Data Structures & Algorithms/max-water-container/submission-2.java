class Solution {
    public int maxArea(int[] heights) {
        int waterAmount = 0;
        int i = 0, j = heights.length-1;
        while (j > i) {
            int curVolume = (j-i) * Math.min(heights[j], heights[i]);
            waterAmount = Math.max(waterAmount, curVolume);
            if (heights[i] <= heights[j])  {
                i++;
            } else {
                j--;
            }
        }

        return waterAmount;
    }
}
