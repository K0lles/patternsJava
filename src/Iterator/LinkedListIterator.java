package Iterator;

public class LinkedListIterator {
    public LinkedList linkedList;

    public LinkedListIterator(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public void iterate() {
        Node current = this.linkedList.head;
        while(current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
