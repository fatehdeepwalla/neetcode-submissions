class Solution {
    public int maxArea(int[] heights) {
        //int L=0;
        //int R=heights.length-1;
        int maxW=Integer.MIN_VALUE;

        for(int L=0;L<heights.length;L++){
            for(int R=L+1;R<heights.length;R++){
                int currW=Math.min(heights[L],heights[R])*(R-L);
                maxW=Math.max(currW,maxW);
            }
        }
        return maxW;
    }
}
