LINKEDLIST-Insertion at beginning
class Node {
    public int value;
    public Node next;
    public Node(int val) {//Constructor
        value = val;
        next = null;
    }
}
class LinkedList {
    public Node head;
    public void insertFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public int getHeadValue() {
        if (head == null) {
            return -1;
        } else {
            return head.value;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFront(3);
        System.out.println("The value at the head is: " + list.getHeadValue());
        list.insertFront(2);
        System.out.println("The value at the head is: " + list.getHeadValue());
    }
}
