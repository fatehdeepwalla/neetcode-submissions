// A solution with Record
// prefer key set instead of entrySet, unless you want a collection of entrySet
// use of reversed
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.putIfAbsent(x, 0);
            map.put(x, map.get(x)+1);
            //map.put(x, map.getOrDefault(x, 0)+1);
        }

        HashMap<Integer, ArrayList<Integer>> freqMap=new HashMap<>();
        for(Integer num: map.keySet()){
            Integer freq=map.get(num);
            freqMap.putIfAbsent(freq, new ArrayList<Integer>());
            freqMap.get(freq).add(num);
        }


        int[] result = new int[k];

        for(int i=nums.length, j=0;i>0 && j<k ;i--){
            if(!freqMap.containsKey(i)) continue;
            else {
                ArrayList<Integer> tempArr=freqMap.get(i);
                for(Integer x: tempArr){
                    result[j]=x;
                    j++;
                    if(j==k) return result;
                }
            }
        }

        return result;
    }

}
