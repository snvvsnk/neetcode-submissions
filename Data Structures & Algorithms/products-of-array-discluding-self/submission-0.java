class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        
        for ( int j = 0; j < output.length; j++) {
            int x = 1;
            for (int i = 0; i < nums.length ; i++) {
                if (i != j) {
                    x = x * nums[i];
                }
            }
            output[j] = x;
    }

    return output;
         
    }
}

  

