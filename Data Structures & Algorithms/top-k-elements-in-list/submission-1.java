

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count frequencies using a HashMap
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        // 2. Convert to a list of entries and sort by value (descending)
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // 3. Extract the first K keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
