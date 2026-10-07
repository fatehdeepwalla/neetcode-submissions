// Efficient solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        // Building HashMap from an Array
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(nums[i], i);
        }


        for(int i=0;i<size;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && (map.get(diff) != i)) 
                return new int[] {i,map.get(diff)};
        }

        throw new RuntimeException("No indices found");
    }
}
