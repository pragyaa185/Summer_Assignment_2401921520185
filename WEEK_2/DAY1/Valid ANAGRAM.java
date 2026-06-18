class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        
        int[] characterCounts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            characterCounts[s.charAt(i) - 'a']++;
            characterCounts[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (characterCounts[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}
