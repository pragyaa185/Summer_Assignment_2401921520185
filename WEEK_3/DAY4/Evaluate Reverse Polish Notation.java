
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numericStack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+")) {
                numericStack.push(numericStack.pop() + numericStack.pop());
            } 
            else if (token.equals("-")) {
                int secondOperand = numericStack.pop();
                int firstOperand = numericStack.pop();
                numericStack.push(firstOperand - secondOperand);
            } 
            else if (token.equals("*")) {
                numericStack.push(numericStack.pop() * numericStack.pop());
            } 
            else if (token.equals("/")) {
                int secondOperand = numericStack.pop();
                int firstOperand = numericStack.pop();
                numericStack.push(firstOperand / secondOperand);
            } 
            else {
                numericStack.push(Integer.parseInt(token));
            }
        }
        
        return numericStack.pop();
    }
}