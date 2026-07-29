
// Infix to postfix also called as RPN form(Reverse Polish Notation.)
//   eg:
// Input: expression = "(a+b)*c"
// Output: "ab+c*"
  class Solution {
    static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
            default:
            return -1;
        }
    }
    public String infixToPostfix(String s) {
        // Your code goes here
Stack<Character> stack=new Stack<>();
StringBuilder postfix=new StringBuilder();
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(Character.isLetterOrDigit(ch))
    {
        postfix.append(ch);
    }
    else if(ch=='('){
       stack.push(ch);
    }
    else if(ch==')'){
        while(!stack.isEmpty()&&stack.peek()!='('){
            postfix.append(stack.pop());
        }
        stack.pop();
    }else{
        while(!stack.isEmpty()&&prec(stack.peek())>=prec(ch)){
        postfix.append(stack.pop());
        }
        stack.push(ch);
    }
}
    while(!stack.isEmpty()){
        postfix.append(stack.pop());
    }
    return postfix.toString();





    }
}
