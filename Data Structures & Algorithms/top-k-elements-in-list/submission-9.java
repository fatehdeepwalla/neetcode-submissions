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

        Comparator<Map.Entry<Integer, Integer>> c=(m1,m2)->m1.getValue()-m2.getValue();
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap= new PriorityQueue<>(c.reversed());

        minHeap.addAll(map.entrySet());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll().getKey();
        }
        return result;

    }
}
