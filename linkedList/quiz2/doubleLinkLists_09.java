package quiz2;


public class doubleLinkLists_09 {
    node_09 head;
    int size;

    public doubleLinkLists_09() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(pembeli_09 item) {
        if (isEmpty()) {
            head = new node_09(null, item, null);
        } else {
            node_09 newNode = new node_09(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(pembeli_09 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            node_09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node_09 newNode = new node_09(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(pembeli_09 item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            node_09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node_09 newNode = new node_09(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                node_09 newNode = new node_09(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev =newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            node_09 tmp = head;
            System.out.println("+++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Gilang");
            System.out.println("+++++++++++++++++++++");
            System.out.println("|No \t\t |Nama Customer \t\t |No Hp");
            while (tmp != null) {
                // System.out.print(tmp.data + "\t");
                System.out.println("|" + tmp.data.antrian + "\t\t |" + tmp.data.nama + "\t\t\t\t |" + tmp.data.noHP);
                tmp = tmp.next;
            }
            // System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirts() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node_09 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirts();
        } else {
            node_09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public pembeli_09 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        return head.data;
    }

    public pembeli_09 getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        node_09 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public pembeli_09 get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        node_09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void removeByAntrian(int noAntrian) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }
        node_09 current = head;
        while (current != null && current.data.antrian != noAntrian) {
            current = current.next;
        }
        if (current == null) {
            throw new Exception("Nomor antrian tidak ditemukan");
        } else if (current.prev == null) {
            removeFirts();
        } else if (current.next == null) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }
}
