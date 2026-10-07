// Time complexity O(n*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            // getting the temp map
            HashMap<Character, Integer> key= createMap(strs[i]);
            // Adding to Map
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else {
                ArrayList<String> arr=new ArrayList<>();
                arr.add(strs[i]);
                map.put(key,arr);
            }    
        }
        for(HashMap<Character, Integer> x:map.keySet()){
            ArrayList<String> temp = map.get(x);
            result.add(temp);
        }
        return result;
        
    }

    public HashMap<Character, Integer> createMap(String s){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c, 1);
        }
        return map;
    }
}
