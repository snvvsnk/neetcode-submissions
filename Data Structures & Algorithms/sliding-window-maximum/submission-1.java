class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int l = 0;
        int[] output = new int[nums.length-k+1];

        if ( k == 1) {
            return nums;
        }

        for ( int r =0; r < nums.length-k+1; r++) {
            int max = 0;
            l = r;
            while ( l < r+k) {
            max = Math.max(nums[l], max);
            l++;
            }
            output[r] = max;
            
        }

        return output;
        
    }
}
