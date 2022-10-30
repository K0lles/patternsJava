package Iterator;

public class LinkedList {
    public Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        Node current = this.head;
        while(true) {
            if (current.next == null) {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }
}
