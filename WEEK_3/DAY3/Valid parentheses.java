

class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                bracketStack.push(c);
            } 
            else {
                if (bracketStack.isEmpty()) return false;
                
                char topB = bracketStack.pop();
                if (c == ')' && topB != '(') return false;
                if (c == '}' && topB != '{') return false;
                if (c == ']' && topB != '[') return false;
            }
        }
        
        return bracketStack.isEmpty(); 
    }
}