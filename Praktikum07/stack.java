public class stack {

    // int data[];
    int size;
    int top;
    pakaian data[];

    public stack(int size) {
        this.size = size;
        data = new pakaian[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            pakaian x = data[top];
            top--;
            // System.out.println("Data yang dikeluarkan dari stack: " + x);
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + 
            " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        // System.out.println("Elemen teratas stack: " + data[top]);
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna +
        " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack: ");
        // for (int i = top; i >= 0; i--) {
        //     System.out.println(data[i] + " ");
        // }
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " +
            data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosogkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
}