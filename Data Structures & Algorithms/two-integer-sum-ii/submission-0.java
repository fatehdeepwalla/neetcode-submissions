class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L=0;
        int R=numbers.length-1;
        int[] ans=new int[2];

        while(L<R){
            if(numbers[L]+numbers[R]<target) {
                L++;
            }
            else if(numbers[L]+numbers[R]>target) {
                R--;
            }
            else {
                ans[0]=L+1;
                ans[1]=R+1;
                break;
            }
        }
        return ans;

    }
}
