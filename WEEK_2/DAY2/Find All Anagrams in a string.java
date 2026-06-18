

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resultIndexes = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        
        if (pLen > sLen){ 
            return resultIndexes;
            }
        
        int[] pCounts = new int[26];
        int[] wCounts = new int[26];
        
        for (int i = 0; i < pLen; i++) {
            pCounts[p.charAt(i) - 'a']++;
            wCounts[s.charAt(i) - 'a']++;
        }
        
        if (isEqual(pCounts, wCounts)) {
            resultIndexes.add(0);
        }
        
        for (int i = pLen; i < sLen; i++) {
            int in = s.charAt(i) - 'a';
            int out = s.charAt(i - pLen) - 'a';
            
            wCounts[in]++;
            wCounts[out]--;
            
            if (isEqual(pCounts, wCounts)) {
                resultIndexes.add(i - pLen + 1);
            }
        }
        
        return resultIndexes;
    }
    
    private boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]){
                 return false;
                 }

        }
        return true;
    }
}