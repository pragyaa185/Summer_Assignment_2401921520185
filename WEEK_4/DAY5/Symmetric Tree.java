class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkMirrorLayout(root.left, root.right);
    }
    
    private boolean checkMirrorLayout(TreeNode leftSideTree, TreeNode rightSideTree) {
        if (leftSideTree == null && rightSideTree == null) return true;
        if (leftSideTree == null || rightSideTree == null) return false;
        
        return (leftSideTree.val == rightSideTree.val) &&
               checkMirrorLayout(leftSideTree.left, rightSideTree.right) &&
               checkMirrorLayout(leftSideTree.right, rightSideTree.left);
    }
}