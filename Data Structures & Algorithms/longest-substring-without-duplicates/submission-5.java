class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int result = 0;
        Set<Character> charSet = new HashSet();

        while (r < s.length()) {
            if (!charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                result = Math.max(result, r-l+1);
                r++;
            } else {
                charSet.remove(s.charAt(l));
                l++;
            }
        }
        return result;
    }
}
