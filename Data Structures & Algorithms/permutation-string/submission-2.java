class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<Character> h1=new HashSet<>();
        HashSet<Character> h2=new HashSet<>();

        for(int i=0;i<s1.length();i++){
            h1.add(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++){
            h2.add(s2.charAt(i));
        }

        for(Character c: h1){
            if(!h2.contains(c)) return false;
        }

        for(int i=0;i<s2.length();i++){
            if(h1.contains(s2.charAt(i))) {
                if(check(i,s1,s2)) return true;
            }
        }

        return false;
    }

    public boolean check(int i, String s1, String s2){
        if(i+s1.length()>s2.length()) return false;
        s2=s2.substring(i,i+s1.length());
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    
}
