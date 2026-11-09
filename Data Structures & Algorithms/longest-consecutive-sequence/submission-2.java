class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
            h.add(num);
        }
        
        int currL=0;
        int maxL=0;

        while(!h.isEmpty()){
            int min=Integer.MAX_VALUE;
            for (int num : h) {
                min = Math.min(min, num);   
            }
            
            int size=h.size();
            for(int i=0;i<size;i++){
                if(h.remove(min+i)){ 
                    currL++;
                    maxL=Math.max(maxL, currL);
                }
                else {
                    currL=0;
                    break;
                }
            }

        }

        return maxL;
    }
}
