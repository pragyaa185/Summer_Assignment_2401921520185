
class Solution {
    public int firstUniqChar(String s) {
        int[] frequencyMap = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequencyMap[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1; 
    }
}