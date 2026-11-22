class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result= new int[nums.length-k+1];
        Arrays.fill(result, Integer.MIN_VALUE);

        for(int i=0; i<nums.length-k+1; i++){
            for(int j=i;j<i+k;j++){
                result[i]=Math.max(result[i],nums[j]);
            }
        }
        return result;


    }
}
