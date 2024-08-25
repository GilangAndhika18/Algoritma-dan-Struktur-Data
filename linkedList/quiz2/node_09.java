package quiz2;

public class node_09 {
    pembeli_09 data;
    node_09 prev, next;
    

    node_09(node_09 prev, pembeli_09 data, node_09 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
