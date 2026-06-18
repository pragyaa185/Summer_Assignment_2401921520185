
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineStock = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            magazineStock[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int targetChar = ransomNote.charAt(i) - 'a';
            
            if (magazineStock[targetChar] == 0) {
                return false; 
            }
            magazineStock[targetChar]--; 
        }
        
        return true;
    }
}