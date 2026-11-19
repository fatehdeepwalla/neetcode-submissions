class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int maxLength=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            if(!h.contains(s.charAt(r))){
                h.add(s.charAt(r));
                maxLength=Math.max(maxLength,h.size());
            }
            else{
                while(s.charAt(l)!=s.charAt(r)){
                    h.remove(s.charAt(l));
                    l++;
                }
                l++;

            }
        }
        return maxLength;
    }
}
