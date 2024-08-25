public class SLLMain {
    public static void main(String[] args) {
        linkedList myLinkedList = new linkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));
        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();

        myLinkedList.addLast(600);
        myLinkedList.addFirst(700);

        System.out.println("Menambahkan sebelum 700");
        myLinkedList.insertBefore(700, 650);
        myLinkedList.print();

        System.out.println("Menambahkan pada index ke-2:");
        myLinkedList.insertAt(2, 550);
        myLinkedList.print();

        System.out.println("Menghapus pada index ke-2:");
        myLinkedList.removeAt(2);
        myLinkedList.print();
        
        try {
            System.out.println("Data pada index ke-5: " + myLinkedList.getData(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
