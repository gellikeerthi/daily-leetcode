/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/
class Solution {
    public ListNode insertBeforeHead(ListNode head, int data) {
        // Your code goes here
        ListNode newnode=new ListNode(data);
        newnode.next=head;
        head=newnode;
        newnode.prev=null;
        return head;
    }
}
