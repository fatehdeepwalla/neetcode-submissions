class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size=nums.length;

        // ith element is being checked
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(nums[i]==nums[j] && i!=j) return true;
            }
        }

        return false;
    }
}