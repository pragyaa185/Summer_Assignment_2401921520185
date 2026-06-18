
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubledString = s + s;
        
        String modifiedString = doubledString.substring(1, doubledString.length() - 1);
        
        
        return modifiedString.contains(s);
    }
}