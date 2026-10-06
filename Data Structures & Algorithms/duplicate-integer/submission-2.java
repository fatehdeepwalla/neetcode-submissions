class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h= new HashSet<>();

        // ith element is being checked
        for(Integer x: nums){
            if(!h.add(x)) return true;
        }
        return false;
    }
}