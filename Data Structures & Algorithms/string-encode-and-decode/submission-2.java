class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb=new StringBuilder();

        for(String s : strs){
            sb.append(encodeOne(s));
            sb.append("#@#");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>(List.of(str.split("#@#",-1)));

        for(int i=0;i<result.size();i++){
            result.set(i, decodeOne(result.get(i)));
        }
        result.removeLast();
        return result;
    }

    public String encodeOne(String strs){
        char[] result=new char[strs.length()];
        int shift=1;

        for(int i =0;i<strs.length();i++){
            char c=strs.charAt(i);
            if(Character.isLowerCase(c)){
                result[i] = (char)('a'+(c-'a'+shift)%26); 
            }
            else if(Character.isUpperCase(c)){
                result[i] = (char)('A'+(c-'A'+shift)%26);
            }
            else{
                result[i]=c;
            }
        }
        return new String(result);
    }

    public String decodeOne(String strs){
        char[] result=new char[strs.length()];
        int shift=1;

        for(int i =0;i<strs.length();i++){
            char c=strs.charAt(i);
            if(Character.isLowerCase(c)){
                result[i] = (char)('a'+(c-'a'-shift+26)%26); 
            }
            else if(Character.isUpperCase(c)){
                result[i] = (char)('A'+(c-'A'-shift+26)%26);
            }
            else{
                result[i]=c;
            }
        }
        return new String(result);
    }
}
