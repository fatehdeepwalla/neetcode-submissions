class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb=new StringBuilder();

        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(encodeOne(s));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>();
        int length;
        int index1=0;
        int index2=0;
        for(;index2<str.length();index2++){
            while(str.charAt(index2)!='#') index2++;
            length=Integer.parseInt(str.substring(index1,index2));

            
            index1=index2+1;
            index2=index2+length+1;

            if(length==0) {
                result.add("");
                continue;
            }
            String s=str.substring(index1,index2);
            result.add(decodeOne(s)); 
            index1=index2;
        }
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
