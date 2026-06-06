Delete from front
void deleteNode(int value) {
    if (head.value == value) {
        Node targetNode = head;
        head=targetNode.next;
    }
}
