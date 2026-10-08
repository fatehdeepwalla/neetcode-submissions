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

        ArrayList<pair> list = new ArrayList<>();
        for(Integer x: map.keySet()){
            pair temp=new pair(x, map.get(x));
            list.add(temp);
        }

        Comparator<pair> c= ((p1,p2)->p1.frequency() - p2.frequency());
        list.sort(c.reversed());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).number();
        }
        return result;
    }

    public record pair(int number, int frequency){}
}
