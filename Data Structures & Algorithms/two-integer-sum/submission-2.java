// Efficient solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        // Building HashMap from an Array
        HashMap<Integer, Integer> map= new HashMap<>();
        for(Integer x: nums){
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else map.put(x, 1);
        }



        for(int i=0;i<size;i++){
            if(map.containsKey(target-nums[i])) {
                for(int j=i+1;j<size;j++){
                    if(nums[j]==target-nums[i]) return new int[] {i,j};
                }
            }
        }

        throw new RuntimeException("No indices found");
    }
}
