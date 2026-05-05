class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i< s.length(); i ++) {
            char c = s.charAt(i);
            if ( c <= 127 && Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        System.out.println(sb);
        
        StringBuilder reverseSb = new StringBuilder();

        for (int i = sb.length()-1; i >= 0 ; i--) {
            reverseSb.append(Character.toLowerCase(sb.charAt(i)));
        }

        System.out.println(reverseSb);

        if (sb.toString().equals(reverseSb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
