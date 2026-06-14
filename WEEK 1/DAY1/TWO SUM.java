public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Look through every single number
        for (int i = 0; i < numbers.length; i++) {
            // Compare it with every number that comes after it
            for (int j = i + 1; j < numbers.length; j++) {
                // If they add up to the target, we found our pair!
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {}; // Return empty if no match
    }
}