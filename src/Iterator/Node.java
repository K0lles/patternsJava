package Iterator;

public class Node {
    public int number;
    public Node next;

    public Node(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number = " + number;
    }
}
