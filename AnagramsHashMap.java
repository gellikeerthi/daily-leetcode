class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
       HashMap<Character,Integer>map1=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch1=s.charAt(i);
        map1.put(ch1,map1.getOrDefault(ch1,0)+1);
       }
       HashMap<Character,Integer> map2=new HashMap<>();
       for(int i=0;i<t.length();i++){
        char ch2=t.charAt(i);
        map2.put(ch2,map2.getOrDefault(ch2,0)+1);
       }
        
       if(map1.equals(map2)){
        return true;
       }
       else{
        return false;
       }
    }
}
