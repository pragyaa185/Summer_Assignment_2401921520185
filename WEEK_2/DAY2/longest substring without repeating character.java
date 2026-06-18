
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int totalLength = s.length();
        int maximumWindowSize = 0;
        int leftWall = 0;
        int[] elementCounts = new int[128];
        
        for (int rightWall = 0; rightWall < totalLength; rightWall++) {
            char currentElement = s.charAt(rightWall);
            elementCounts[currentElement]++;
            
            while (elementCounts[currentElement] > 1) {
                char leftElement = s.charAt(leftWall);
                elementCounts[leftElement]--;
                leftWall++;
            }
            
            int currentWindowSize = rightWall - leftWall + 1;
            if (currentWindowSize > maximumWindowSize) {
                maximumWindowSize = currentWindowSize;
            }
        }
        
        return maximumWindowSize;
    }
}