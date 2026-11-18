class Solution {
    public int maxArea(int[] heights) {
        int L=0;
        int R=heights.length-1;
        int maxW=Integer.MIN_VALUE;

        while(L<R){
                int currW=Math.min(heights[L],heights[R])*(R-L);
                maxW=Math.max(currW,maxW);

                if(heights[L]<heights[R])L++;
                else R--;

        }
        return maxW;
    }
}
