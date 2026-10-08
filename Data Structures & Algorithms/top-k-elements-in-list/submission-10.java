// Used heap instead 
// directly added elements to heap which would not be linear in time.
// this time i used constructor to add elements.
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.putIfAbsent(x, 0);
            map.put(x, map.get(x)+1);
            //map.put(x, map.getOrDefault(x, 0)+1);
        }

        ArrayList<pair> list = new ArrayList<>();
        for(Integer x: map.keySet()){
            pair temp=new pair(x, map.get(x));
            list.add(temp);
        }


        PriorityQueue<pair> minHeap= new PriorityQueue<>(list);

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll().number();
        }
        return result;
    }

    public record pair (int number, int frequency) implements Comparable<pair>{
        public int compareTo(pair other){
            return -(this.frequency()-other.frequency);
        }
    }
}
