class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length;
        int[] maxResultArray = new int[n - k + 1];
        
        int[] indexDeque = new int[n];
        int headPointer = 0;
        int tailPointer = 0;
        
        for (int i = 0; i < n; i++) {
            if (headPointer < tailPointer && indexDeque[headPointer] < i - k + 1) {
                headPointer++;
            }
            
            while (headPointer < tailPointer && nums[indexDeque[tailPointer - 1]] < nums[i]) {
                tailPointer--;
            }
            
            indexDeque[tailPointer] = i;
            tailPointer++;
            
            if (i >= k - 1) {
                maxResultArray[i - k + 1] = nums[indexDeque[headPointer]];
            }
        }
        
        return maxResultArray;
    }
}