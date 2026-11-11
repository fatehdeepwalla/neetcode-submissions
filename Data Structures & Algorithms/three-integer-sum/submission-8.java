class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int L=i+1;
            int R=nums.length-1;
            while(L<R){
                if(nums[L]+nums[R]<-nums[i]) L++;
                else if(nums[L]+nums[R]>-nums[i]) R--;
                else{
                    if(L!=i+1 && nums[L]==nums[L-1]) {
                        L++;
                        continue;
                    }
                    List<Integer> temp=new ArrayList<>(List.of(nums[i],nums[L],nums[R]));
                    ans.add(temp);
                    L++;
                    R--;
                }
            }  
        }
        
        return ans;
    }
}
