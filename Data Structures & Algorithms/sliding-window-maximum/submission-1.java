class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result= new int[nums.length-k+1];
        Arrays.fill(result, Integer.MIN_VALUE);
        PriorityQueue<int []> maxHeap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0; i<nums.length; i++){
            if(i<k){
                maxHeap.add(new int[]{nums[i],i});
                if(i==k-1) result[0]=maxHeap.element()[0];
            }
            else{
                maxHeap.add(new int[]{nums[i],i});
                while(maxHeap.element()[1]<i-k+1) maxHeap.remove();
                result[i-k+1]=maxHeap.element()[0];
            }
            
        }
        return result;
    }
}
