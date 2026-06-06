INSERTION AT Kth POSITION
void insertAfterK(int value, int k) {
    Node newNode = new Node(value);
    Node current = head;
    if (current == null) {
        head = newNode;
        return;
    }
    // Iterate to the k-th node
    for (int i = 1; i < k; i++) {
        current = current.next;
    }
     newNode.next=current.next;
     current.next=newNode;
}
