
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        
        for(Character c: sArr){
            if(sMap.containsKey(c)) sMap.put(c, sMap.get(c)+1);
            else sMap.put(c,1);
        }

        for(Character c: tArr){
            if(tMap.containsKey(c)) tMap.put(c, tMap.get(c)+1);
            else tMap.put(c,1);
        }

        return sMap.equals(tMap);
    }
}
