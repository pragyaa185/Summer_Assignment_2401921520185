
class Solution {
    public int compress(char[] chars) {
        int RIndex = 0;
        int i = 0;
        
        while (i < chars.length) {
            char cc = chars[i];
            int repeatCount = 0;
            
            while (i < chars.length && chars[i] == cc) {
                repeatCount++;
                i++;
            }
            
            chars[RIndex] = cc;
            RIndex++;
            
            if (repeatCount > 1) {
                String countString = Integer.toString(repeatCount);
                for (int k = 0; k < countString.length(); k++) {
                    chars[RIndex] = countString.charAt(k);
                    RIndex++;
                }
            }
        }
        
        return RIndex; 
    }
}