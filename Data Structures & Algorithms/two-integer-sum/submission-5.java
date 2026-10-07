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

        int first_index=0;

        for(int i=0;i<size;i++){
            boolean same = nums[i]==target-nums[i];
            boolean hasTwo=map.get(nums[i])>=2;
            if(map.containsKey(target-nums[i]) && (!same || hasTwo)) {
                first_index=i;
                break;
                }
        }

        for(int j=first_index+1;j<size;j++){
            if(nums[j]==target-nums[first_index]) return new int[] {first_index,j};
        }

        throw new RuntimeException("No indices found");
    }
}
