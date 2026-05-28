

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Fix edge case

        Set<Integer> orderedSet = new TreeSet<>();
        for (int num : nums) {
            orderedSet.add(num);
        }

        List<Integer> orderedList = new ArrayList<>(orderedSet);
        
        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 0; i < orderedList.size() - 1; i++) {
            if (orderedList.get(i) + 1 == orderedList.get(i + 1)) {
                currentStreak++;
            } else {
                
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1;
            }
        }
        
        
        return Math.max(maxStreak, currentStreak);
    }
}
