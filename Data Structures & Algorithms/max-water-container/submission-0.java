class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int currentArea = 0;
        for (int i = 0 ; i < heights.length ; i ++) {
            for ( int j = 1 ; j < heights.length ; j++) {
                int minH = Math.min(heights[i], heights[j]);
                currentArea  = minH * (j-i);
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        return maxArea;
    }
}
