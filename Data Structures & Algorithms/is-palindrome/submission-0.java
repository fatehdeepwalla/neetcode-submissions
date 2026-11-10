class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        s=sb.toString();
        int size=s.length();
        for(int i=0;i<size;i++){
            if(s.charAt(i)!=s.charAt(size-1-i)) return false;
        }
        return true;
    }
}
