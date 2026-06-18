
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder finalAnswer = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            char[] wordChars = words[i].toCharArray();
            reverseSingleWord(wordChars);
            
            finalAnswer.append(wordChars);
            if (i < words.length - 1) {
                finalAnswer.append(" ");
            }
        }
        
        return finalAnswer.toString();
    }
    
    private void reverseSingleWord(char[] word) {
        int left = 0;
        int right = word.length - 1;
        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
    }
}