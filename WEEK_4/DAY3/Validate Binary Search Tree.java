class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkValidLimits(root, null, null);
    }
    
    private boolean checkValidLimits(TreeNode node, Integer minBoundary, Integer maxBoundary) {
        if (node == null) return true;
        
        if (minBoundary != null && node.val <= minBoundary) return false;
        if (maxBoundary != null && node.val >= maxBoundary) return false;
        
        return checkValidLimits(node.left, minBoundary, node.val) && 
               checkValidLimits(node.right, node.val, maxBoundary);
    }
}