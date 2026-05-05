class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            System.out.println("size ::"+ seen.size());
            if (!seen.add(n)) { // If add fails, it's a duplicate
                return true;
            }
        }
        return false;
    }
}
