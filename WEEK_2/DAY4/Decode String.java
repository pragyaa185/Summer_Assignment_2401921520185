class Solution {
    private int globalIndex = 0;    
    
    public String decodeString(String s) {
        StringBuilder currentSegment = new StringBuilder();
        int repetitionCount = 0;
        
        while (globalIndex < s.length()) {
            char currentChar = s.charAt(globalIndex);
            
            if (Character.isDigit(currentChar)) {
                repetitionCount = repetitionCount * 10 + (currentChar - '0');
                globalIndex++;
            } 
            else if (currentChar == '[') {
                globalIndex++; 
                String innerDecodedString = decodeString(s);
                
                while (repetitionCount > 0) {
                    currentSegment.append(innerDecodedString);
                    repetitionCount--;
                }
                globalIndex++; 
            } 
            else if (currentChar == ']') {
                break; 
            } 
            else {
                currentSegment.append(currentChar);
                globalIndex++;
            }
        }
        
        return currentSegment.toString();
    }
}