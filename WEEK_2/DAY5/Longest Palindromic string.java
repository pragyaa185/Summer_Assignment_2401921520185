class Solution {
    private int startPos = 0;
    private int maxPalLen = 0;

    public String longestPalindrome(String s) {
        int strLen = s.length();
        if (strLen < 2) return s;

        for (int center = 0; center < strLen; center++) {
            expandAroundCenter(s, center, center);     
            expandAroundCenter(s, center, center + 1);
        }

        return s.substring(startPos, startPos + maxPalLen);
    }

    private void expandAroundCenter(String s, int left, int right) {
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
           
            left--;
            right++;
        }
        
        int currentLength = right - left - 1;
        if (currentLength > maxPalLen) {
            startPos = left + 1;
            maxPalLen = currentLength;
        }
    }
}