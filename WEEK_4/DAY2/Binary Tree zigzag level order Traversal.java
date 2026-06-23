
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        collectLevels(root, 0, resultList);
        
        for (int i = 1; i < resultList.size(); i += 2) {
            List<Integer> currentFloor = resultList.get(i);
            reverseListInPlace(currentFloor);
        }
        
        return resultList;
    }
    
    private void collectLevels(TreeNode node, int level, List<List<Integer>> res) {
        if (node == null) return;
        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        collectLevels(node.left, level + 1, res);
        collectLevels(node.right, level + 1, res);
    }
    
    private void reverseListInPlace(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temporaryBox = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temporaryBox);
            left++;
            right--;
        }
    }
}