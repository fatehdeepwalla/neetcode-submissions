// a new way of doing things
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        // filling in both the hashmaps
        for(int i=0;i<s.length(); i++){
            Character x=s.charAt(i);
            Character y=t.charAt(i);
            if(sMap.containsKey(x)) sMap.put(x, sMap.get(x)+1);
            else sMap.put(x,1);
            if(tMap.containsKey(y)) tMap.put(y, tMap.get(y)+1);
            else tMap.put(y,1);
        }
        
        // instead of using equals method of HashMap
        Iterator<Character> it = sMap.keySet().iterator();

        while(it.hasNext()){
            Character c= it.next();
            if(!sMap.get(c).equals(tMap.get(c))) return false;
            it.remove();
            tMap.remove(c);
        }
        return true;

    }
}