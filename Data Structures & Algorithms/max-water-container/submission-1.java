class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxArea = 0;
        int currentArea = 0;

        while (left < right) {
            int width = right - left ;
            currentArea = width * Math.min(heights[left], heights[right]);
            maxArea = Math.max(currentArea, maxArea);
            if (heights[left] < heights[right]) {
                    left++;
                } else {
                    right--;
                }
        }

        return maxArea;
    }
}
