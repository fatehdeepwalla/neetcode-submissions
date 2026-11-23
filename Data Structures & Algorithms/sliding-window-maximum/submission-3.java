class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result= new int[nums.length-k+1];
        Arrays.fill(result, Integer.MIN_VALUE);
        PriorityQueue<pair> maxHeap=new PriorityQueue<>((a,b)->b.value()-a.value());
        for(int i=0; i<nums.length; i++){
            maxHeap.add(new pair(nums[i],i));
            if(i>=k-1){
                while(maxHeap.element().index()<i-k+1) maxHeap.remove();
                result[i-k+1]=maxHeap.element().value();
            }
            
        }
        return result;
    }

    record pair(int value, int index){}
}
