// Time complexity O(n^2*m)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();

        List<String> input=new ArrayList<>(Arrays.asList(strs));
        
        while(!input.isEmpty()){
            String s = input.get(0);
            List<String> temp= new ArrayList<>();

            Iterator<String> it = input.iterator();
            while(it.hasNext()){
                String x=it.next();
                if(Anagrams(s,x)){
                    temp.add(x);
                    it.remove();
                }
            }
            result.add(temp);
        }
        return result;
    }

    public boolean Anagrams(String s, String t){
        if(s.length()!=t.length()) return false;
        
        HashMap<Character, Integer> sMap=new HashMap<>();
        HashMap<Character, Integer> tMap=new HashMap<>();

        // Filing the hashmaps
        for (int i=0; i<s.length(); i++){
            Character x=s.charAt(i);
            Character y=t.charAt(i);

            if(sMap.containsKey(x)) sMap.put(x, sMap.get(x)+1);
            else sMap.put(x, 1);

            if(tMap.containsKey(y)) tMap.put(y, tMap.get(y)+1);
            else tMap.put(y, 1);
        }
        return sMap.equals(tMap);
    }
}
