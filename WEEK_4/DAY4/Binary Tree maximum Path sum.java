class Solution {
    private int overallMaxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxBranchSum(root);
        return overallMaxPathSum;
    }
    
    private int findMaxBranchSum(TreeNode node) {
        if (node == null) return 0;
        
        int leftMaxGain = findMaxBranchSum(node.left);
        if (leftMaxGain < 0) leftMaxGain = 0;
        
        int rightMaxGain = findMaxBranchSum(node.right);
        if (rightMaxGain < 0) rightMaxGain = 0;
        
        int localPathSum = node.val + leftMaxGain + rightMaxGain;
        if (localPathSum > overallMaxPathSum) {
            overallMaxPathSum = localPathSum;
        }
        
        if (leftMaxGain > rightMaxGain) {
            return node.val + leftMaxGain;
        } else {
            return node.val + rightMaxGain;
        }
    }
}