class Solution {
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();
        
        if (needleLen > hayLen) return -1;
        
        
        for (int i = 0; i <= hayLen - needleLen; i++) {
            
            String currentPiece = haystack.substring(i, i + needleLen);
            
            if (currentPiece.equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}