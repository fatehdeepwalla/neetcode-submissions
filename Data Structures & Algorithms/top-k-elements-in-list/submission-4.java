// A solution with Record
// prefer key set instead of entrySet, unless you want a collection of entrySet
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

         
        list.sort(Comparator.naturalOrder());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(list.size()-1-i).number();
        }
        return result;
    }

    public record pair (int number, int frequency) implements Comparable<pair>{
        public int compareTo(pair other){
            return this.frequency()-other.frequency;   
        }
    }
}
