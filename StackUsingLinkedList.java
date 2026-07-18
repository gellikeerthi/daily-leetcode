class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListStack {
    Node top;
    public LinkedListStack() {
        top=null;
    }

    public void push(int x) {
       Node newNode=new Node(x);
       newNode.next=top;
       top=newNode;
    }

    public int pop() {
      if(top==null){
        return -1;
      }else{
        int ele=top.data;
        top=top.next;
        return ele;
      }
    }

    public int top() {
        if(top==null){
            return -1;
        }else{
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top==null;
    }
}
