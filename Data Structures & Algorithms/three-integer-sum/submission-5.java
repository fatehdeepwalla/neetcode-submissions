class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            int L=i+1;
            int R=nums.length-1;
            while(L<R){
                if(nums[L]+nums[R]<-nums[i]) L++;
                else if(nums[L]+nums[R]>-nums[i]) R--;
                else{
                    List<Integer> temp=new ArrayList<>(List.of(nums[i],nums[L],nums[R]));
                    ans.add(temp);
                    L++;
                    R--;
                }
            }  
        }
        
        return new ArrayList<List<Integer>>(ans);
    }
}
