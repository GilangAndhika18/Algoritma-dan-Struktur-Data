import java.lang.reflect.InaccessibleObjectException;

public class linkedList {
    node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        node newNode = new node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        node newNode = new node(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            node currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        node newNode = new node(input, null);

        if (!isEmpty()) {
            node currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public void insertBefore(int key, int input) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head.data == key) {
            addFirst(input);
            return;
        }

        node currentNode = head;
        node newNode = new node(input, null);

        while (currentNode.next != null && currentNode.next.data != key) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else {
            System.out.println("Key tidak ditemukan dalam linked list");
        }
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index di luar batas");
        }

        if (index == 0) {
            addFirst(input);
            return;
        }

        node currentNode = head;
        for (int i = 0; i < index -1; i++) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Indeks di luar batas");
            }
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            node newNode = new node(input, currentNode.next);
            currentNode.next = newNode;
        } else {
            throw new InaccessibleObjectException("Index di luar batas");
        }
    }

    public int getData(int index) {
        node currentNode = head;

        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Index di luar batas");
        }

        currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int indexOf(int key) {
        node currentNode = head;
        int index = 0;
        
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        node currentNode = head;
        for (int i = 0; i < index -1; i++) {
            if (currentNode == null || currentNode.next == null) {
                throw new IndexOutOfBoundsException("Indeks di luar batas");
            }
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
    }
}
