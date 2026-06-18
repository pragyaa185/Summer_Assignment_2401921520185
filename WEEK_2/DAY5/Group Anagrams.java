

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        int totalElements = strs.length;
        String[] sortedWords = new String[totalElements];
        boolean[] isGrouped = new boolean[totalElements];
        
        for (int i = 0; i < totalElements; i++) {
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            sortedWords[i] = new String(tempArray);
        }
        
        List<List<String>> groupedResult = new ArrayList<>();
        
        for (int i = 0; i < totalElements; i++) {
            if (!isGrouped[i]) {
                List<String> currentGroup = new ArrayList<>();
                currentGroup.add(strs[i]);
                isGrouped[i] = true;
                
                for (int j = i + 1; j < totalElements; j++) {
                    if (!isGrouped[j] && sortedWords[i].equals(sortedWords[j])) {
                        currentGroup.add(strs[j]);
                        isGrouped[j] = true;
                    }
                }
                groupedResult.add(currentGroup);
            }
        }
        
        return groupedResult;
    }
}