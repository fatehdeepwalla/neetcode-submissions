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


        int[] result=new int[k];
        for(int i=0;i<k;i++){
            int key=max(map);
            result[i]=key;
            map.remove(key);
        }
        return result;
    }

    public record pair(int number, int frequency){}

    public int max(HashMap<Integer, Integer> map){
        int key=0;
        int max=Integer.MIN_VALUE;
        
        for(Integer x: map.keySet()){
            if(max< map.get(x)){
                max=map.get(x);
                key=x;
            }
        }
        return key;
    }
}
