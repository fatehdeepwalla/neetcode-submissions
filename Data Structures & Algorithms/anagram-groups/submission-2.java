// Time complexity O(n*m*lgm)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        
        HashMap<String, ArrayList<String>> map= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            // Sorting the string
            char[] temp=strs[i].toCharArray(); 
            Arrays.sort(temp);
            String s=new String(temp);

            // Adding to Map
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else {
                ArrayList<String> arr=new ArrayList<>();
                arr.add(strs[i]);
                map.put(s,arr);
            }    
        }
        for(String s:map.keySet()){
            ArrayList<String> temp=map.get(s);
            result.add(temp);
        }
        return result;
        
    }
}
