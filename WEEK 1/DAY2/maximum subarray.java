class Solution {
    public int maxSubArray(int[] nums) { 
        int cs=nums[0];
        int hs=nums[0];
        for(int i = 1;i<nums.length;i++){
            if(cs<0){
                cs = nums[i];

            }
            else {
                cs=cs+ nums[i];
            }
            if(cs>hs){
                hs=cs;

            }
        }
        return hs;
    }
}