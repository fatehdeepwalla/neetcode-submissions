class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map=new HashMap<>();
        
        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        String sub="";
        int l=0;
        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;
        HashMap<Character, Integer> tempMap=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                if(!map.containsKey(s.charAt(l))) l=r;
                tempMap.put(c, tempMap.getOrDefault(c, 0)+1);
                while (check(map, tempMap)) {
                    int currentLength = r - l + 1;
                    if (currentLength < bestLength) {
                        bestLength = currentLength;
                        bestStart = l;
                    }
                    remove(s.charAt(l),tempMap);
                    l++;
                    while(l< s.length() && !map.containsKey(s.charAt(l))){
                        l++;
                    }
                    
                }
            }
        }
        
        if (bestLength == Integer.MAX_VALUE) return "";
        return s.substring(bestStart, bestStart + bestLength);
    }
    public boolean check(HashMap<Character, Integer> map,HashMap<Character, Integer> tempMap){
        for(char c: map.keySet()){
            if(!tempMap.containsKey(c)) return false;
            if(map.get(c)>tempMap.get(c)) return false;
        }
        return true;
    }

    public void remove(char c, HashMap<Character, Integer> map){
        map.put(c,map.get(c)-1);
        if(map.get(c)<=0) map.remove(c);
    }
}
