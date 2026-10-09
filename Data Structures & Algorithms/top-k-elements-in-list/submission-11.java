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

        ArrayList<Integer>[] frequency= (ArrayList<Integer>[]) new ArrayList<?>[nums.length+1];
        for(Integer key: map.keySet()){
            Integer v=map.get(key);
            if(frequency[v]==null) frequency[v]=new ArrayList<>();
            frequency[v].add(key);
        }


        int[] result = new int[k];
        int index = 0;
        for (int i = nums.length, j=0; i > 0 && j < k; i--) {
            if (frequency[i] == null) {
                continue;
            }

            for (int value : frequency[i]) {
                result[j++] = value;

                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }

}
