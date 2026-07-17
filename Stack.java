class ArrayStack {
    int a[];
    int top;
    public ArrayStack() {
         a=new int[1000];
         top=-1;
    }

    public void push(int x) {
       if(top==a.length-1){
return ;}
        else{
        top=top+1;
        a[top]=x;
               }
    }

    public int pop() {
      if(top==-1){
        return -1;
      }
      else{
       return a[top--];
      }
    }

    public int top() {
        if(top==-1){
            return -1;
        }
        return a[top];
    }

    public boolean isEmpty() {
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
}

