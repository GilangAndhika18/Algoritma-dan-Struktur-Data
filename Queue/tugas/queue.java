package tugas;

public class queue {

    pasien[] data;
    int front;
    int rear;
    int size;
    int max;

    public queue(int n) {
        max = n;
        data = new pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noID
            + " " + data[front].jenisKelamin + " " + data[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nama + " " + data[i].noID + " " + data[i].jenisKelamin
                + " " + data[i].umur);
                i = (i+1) % max;
            }
            System.out.println(data[i].nama + " " + data[i].noID + " " + data[i].jenisKelamin + 
            " " + data[i].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(pasien dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            // System.exit(0); //stop program saat overflow
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        data[rear] = dt;
        size++;
    }

    public pasien dequeue() {
        pasien dt = new pasien();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            // System.exit(0); //stop prorgam saat underflow
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: " + data[rear].nama + " " + data[rear].noID + " " + data[rear].jenisKelamin +
            " " + data[rear].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
}