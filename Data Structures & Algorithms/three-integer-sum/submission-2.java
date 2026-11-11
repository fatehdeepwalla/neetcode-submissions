class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]>0) break;
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]>0) break;
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                        if(!ans.contains(temp)) ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}
