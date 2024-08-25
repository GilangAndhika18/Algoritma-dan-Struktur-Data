public class Node {
    Node prev;
    int data;
    Node next;

    // Constructor untuk inisialisasi node
    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
