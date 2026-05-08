class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums); // 1. Sort the array

    for (int i = 0; i < nums.length - 2; i++) {
        // 2. Skip duplicate values for the first number
        if (i > 0 && nums[i] == nums[i - 1]) continue;

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                
                // 3. Skip duplicates for the second and third numbers
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;
                
                left++;
                right--;
            } else if (sum < 0) {
                left++; // Sum too small, move left pointer right
            } else {
                right--; // Sum too large, move right pointer left
            }
        }
    }
    return res;
}

}
