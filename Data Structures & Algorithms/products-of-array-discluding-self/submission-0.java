class Solution {
    public int[] productExceptSelf(int[] nums) {
        int key=numZero(nums);
        int product=1;
        int[] result=new int[nums.length];


        if(key>=2){
            Arrays.fill(result,0);
            return result;
        }

        else if(key==1){
            Arrays.fill(result,0);
            for(int x: nums){
                if(x!=0) product*=x;
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) result[i]=product; 
            }
            return result;
        }

        else{
            for(int x: nums){
                product*=x;
            }

            for(int i=0;i<nums.length;i++){
                result[i]=product/nums[i]; 
            }
            return result;
        }
    }

    public int numZero(int[] nums){
        int key=0;
        for(int x: nums){
            if(x==0) key++;
        }
        return key;
    }
}  
