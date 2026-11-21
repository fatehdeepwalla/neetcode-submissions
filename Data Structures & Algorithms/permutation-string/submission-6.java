class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> h1=new HashMap<>();
        HashMap<Character, Integer> h2=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            h1.put(c, h1.getOrDefault(c, 0)+1);
        }

        int l=0;
        HashMap<Character, Integer> temp=new HashMap<>();

        for(int r=0;r<s2.length();r++){
            char cLeft=s2.charAt(l);
            char cRight=s2.charAt(r);
            if(h1.containsKey(cRight)) {
                if(r-l+1<=s1.length()){
                    temp.put(cRight, temp.getOrDefault(cRight, 0)+1);
                    if(temp.equals(h1)) return true;
                }
                else{
                    temp.put(cLeft, temp.get(cLeft)-1);
                    if(temp.get(cLeft)<=0) temp.remove(cLeft);
                    temp.put(cRight, temp.getOrDefault(cRight, 0)+1);
                    if(temp.equals(h1)) return true;
                    l++;
                }
            }
            else {
                l=r+1;
                temp.clear();
            }
        }

        return false;
    }
    
}
