class ArrayQueue {
    int cur=0;
    int front=-1,rear=-1;
    int a[];
    int size=1000;
    public ArrayQueue() {
    a=new int[size];

    }

    public void push(int x) {
       if(cur==size)
       return;
       if(cur==0){
        front=0;
        rear=0;
        a[rear]=x;
        cur++;
        return;
       }
       rear=(rear+1)%size;
       a[rear]=x;
cur++;
    }

    public int pop() {
      if(cur==0){
        return -1;
      }
     int ele=a[front];
      if(cur==1){
        front=-1;
        rear=-1;
      }else{
      front=(front+1)%size; 
      }
      cur--; 
      return ele; 
       }

    public int peek() {
        if(cur==0){
            return -1;
        }else{
        return a[front];
        }
    }

    public boolean isEmpty() {
if(cur==0){
    return true;
}else{
    return false;
}


    }
}
