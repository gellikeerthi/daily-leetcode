class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>set=new HashSet<>();
        char ch1=' ';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
               set.add(ch);
            }else{
              
                ch1=ch;
                break;
            }
        }
       
           return ch1;
        
        
    }
}
