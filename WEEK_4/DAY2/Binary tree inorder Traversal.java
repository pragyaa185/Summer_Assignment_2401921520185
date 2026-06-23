
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        travelInorder(root, resultList);
        return resultList;
    }
    
    private void travelInorder(TreeNode currentNode, List<Integer> list) {
        if (currentNode == null) return;
        
        travelInorder(currentNode.left, list);  
        list.add(currentNode.val);             
        travelInorder(currentNode.right, list); 
    }
}