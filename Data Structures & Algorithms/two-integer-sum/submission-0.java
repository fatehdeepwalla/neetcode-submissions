// brute force solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result= new int[2];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j && nums[i]+nums[j]==target) {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }

        throw new RuntimeException("No indices found");
    }
}
