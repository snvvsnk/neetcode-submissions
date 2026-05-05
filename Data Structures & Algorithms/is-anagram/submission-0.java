class Solution {
    public boolean isAnagram(String s, String t) {
            if (s.length() == t.length()) {
                for (int i=0; i<s.length(); i++) {
                    char currentChar = s.charAt(i);
                    if (t.indexOf(currentChar) == -1) {
                        return false;
                    }
                    t = t.replaceFirst(String.valueOf(currentChar), "");
                }
                return true;
            } 
            return false;
    }
}
