class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.putIfAbsent(x, 0);
            map.put(x, map.get(x)+1);
            //map.put(x, map.getOrDefault(x, 0)+1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)->e1.getValue() - e2.getValue());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(list.size()-1-i).getKey();
        }
        return result;

    }
}
