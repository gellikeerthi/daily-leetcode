Sample Input
2
hello
world
hi
world
Sample Output
YES
NO

public static String twoStrings(String s1, String s2) {
    // Write your code here
HashSet<Character>set=new HashSet<>();
for(int i=0;i<s1.length();i++){
    char ch=s1.charAt(i);
    if(!set.contains(ch)){
        set.add(ch);
    }
}
for(int i=0;i<s2.length();i++){
    char ch2=s2.charAt(i);
    if(set.contains(ch2)){
        return "YES";
    }
}return "NO";
    }


