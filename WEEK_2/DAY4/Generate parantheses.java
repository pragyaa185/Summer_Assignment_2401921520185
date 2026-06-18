
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> validCombinations = new ArrayList<>();
        buildCombination("", n, n, validCombinations);
        return validCombinations;
    }
    
    private void buildCombination(String current, int openLeft, int closeLeft, List<String> result) {
        if (openLeft == 0 && closeLeft == 0) {
            result.add(current);
            return;
        }
        
        if (openLeft > 0) {
            buildCombination(current + "(", openLeft - 1, closeLeft, result);
        }
        
        if (closeLeft > openLeft) {
            buildCombination(current + ")", openLeft, closeLeft - 1, result);
        }
    }
}