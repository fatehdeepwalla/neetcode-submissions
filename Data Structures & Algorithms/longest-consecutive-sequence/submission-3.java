class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            h.add(num);
        }
        
        int currL=0;
        int maxL=0;

        for (int num : nums) {
            if(!h.contains(num-1)){
                int i=0;
                while(h.contains(num+i)){
                    currL++;
                    maxL=Math.max(currL, maxL);
                    i++;
                }
            }
            currL=0;
        }

        return maxL;
    }
}
