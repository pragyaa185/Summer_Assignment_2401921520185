
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indexStack = new Stack<>();
        int maximumArea = 0;
        int totalBars = heights.length;
        
        for (int i = 0; i <= totalBars; i++) {
            int currentBarHeight = (i == totalBars) ? 0 : heights[i];
            
            while (!indexStack.isEmpty() && currentBarHeight < heights[indexStack.peek()]) {
                int heightOfRectangle = heights[indexStack.pop()];
                int widthOfRectangle = indexStack.isEmpty() ? i : i - indexStack.peek() - 1;
                
                int calculatedArea = heightOfRectangle * widthOfRectangle;
                if (calculatedArea > maximumArea) {
                    maximumArea = calculatedArea;
                }
            }
            indexStack.push(i);
        }
        
        return maximumArea;
    }
}