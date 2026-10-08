// A solution with Record
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
        for(Map.Entry<Integer, Integer> x: map.entrySet()){
            pair temp=new pair(x.getKey(), x.getValue());
            list.add(temp);
        }

         
        list.sort((p1,p2)->p1.frequency() - p2.frequency());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(list.size()-1-i).number();
        }
        return result;
    }

    public record pair(int number, int frequency){}
}
