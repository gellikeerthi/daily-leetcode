class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListQueue {
    Node front;
    Node rear;
    public LinkedListQueue() {
        front=null;
        rear=null;
    }

    public void push(int x) {
       Node newNode=new Node(x);
       if(front==null||rear==null){
        front=newNode;
        rear=newNode;
       }else{
        rear.next=newNode;
        rear=newNode;
       }
    }

    public int pop() {
      if(front==null||rear==null){
        return -1;
      }else{
        int ele=front.data;
        front=front.next;
        if(front==null){
            rear==null;
        }
        return ele;
      }
    }

    public int peek() {
        if(front==null){
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front==null;
    }
}
