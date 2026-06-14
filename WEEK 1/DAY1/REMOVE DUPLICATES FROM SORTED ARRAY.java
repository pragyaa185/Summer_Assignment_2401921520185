class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int uniqueposition = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[uniqueposition]){
                uniqueposition=uniqueposition+1 ;
                nums[uniqueposition] = nums[i];

            }
        }
        return uniqueposition + 1;

        
    }
}