
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outputFloorPlan = new ArrayList<>();
        traverseFloorByFloor(root, 0, outputFloorPlan);
        return outputFloorPlan;
    }
    
    private void traverseFloorByFloor(TreeNode node, int currentFloor, List<List<Integer>> res) {
        if (node == null) return;
        
        if (currentFloor == res.size()) {
            res.add(new ArrayList<>());
        }
        
        res.get(currentFloor).add(node.val);
        
        traverseFloorByFloor(node.left, currentFloor + 1, res);
        traverseFloorByFloor(node.right, currentFloor + 1, res);
    }
}