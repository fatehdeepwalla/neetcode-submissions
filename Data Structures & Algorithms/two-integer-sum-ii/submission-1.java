class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans=new int[2];
        HashSet<Integer> h=new HashSet<>();
        for(int x: numbers){
            h.add(x);
        }

        for(int i=0;i<numbers.length;i++){
            if(h.contains(target-numbers[i])){
                ans[0]=i+1;
                for(int j=i+1;j<numbers.length;j++){
                    if(numbers[j]==target-numbers[i]) ans[1]=j+1;
                }
                break;
            }
        }

        return ans;
    }
}
