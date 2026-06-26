class Solution {
    private int preorderTrackerIdx = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return assembleSubtree(preorder, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode assembleSubtree(int[] preorder, int[] inorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) return null;
        
        int rootVal = preorder[preorderTrackerIdx];
        TreeNode rootNode = new TreeNode(rootVal);
        preorderTrackerIdx++;
        
        int rootIndexInorder = inorderStart;
        for (int i = inorderStart; i <= inorderEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndexInorder = i;
                break;
            }
        }
        
        rootNode.left = assembleSubtree(preorder, inorder, inorderStart, rootIndexInorder - 1);
        rootNode.right = assembleSubtree(preorder, inorder, rootIndexInorder + 1, inorderEnd);
        
        return rootNode;
    }
}