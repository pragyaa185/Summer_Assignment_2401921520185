class Solution {
    private int ultimateMaxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeightAndDiameter(root);
        return ultimateMaxDiameter;
    }
    
    private int calculateHeightAndDiameter(TreeNode node) {
        if (node == null) return 0;
        
        int leftSubtreeHeight = calculateHeightAndDiameter(node.left);
        int rightSubtreeHeight = calculateHeightAndDiameter(node.right);
        
        int pathThroughCurrentNode = leftSubtreeHeight + rightSubtreeHeight;
        if (pathThroughCurrentNode > ultimateMaxDiameter) {
            ultimateMaxDiameter = pathThroughCurrentNode;
        }
        
        if (leftSubtreeHeight > rightSubtreeHeight) {
            return leftSubtreeHeight + 1;
        } else {
            return rightSubtreeHeight + 1;
        }
    }
}