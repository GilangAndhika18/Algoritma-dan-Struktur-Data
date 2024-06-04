package tugas2;

public class stack {

    // int data[];
    int size;
    int top;
    struk data[];

    public stack(int size) {
        this.size = size;
        data = new struk[size];
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

    public void push(struk sk) {
        if (!isFull()) {
            top++;
            data[top] = sk;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            struk x = data[top];
            top--;
            // System.out.println("Data yang dikeluarkan dari stack: " + x);
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tglPembelian + 
            " " + x.jmlBarang + " " + x.total);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        // System.out.println("Elemen teratas stack: " + data[top]);
        System.out.println("Elemen teratas: " + data[top].noTransaksi + " " + data[top].tglPembelian +
        " " + data[top].jmlBarang + " " + data[top].total);
    }

    public void print() {
        System.out.println("Isi stack: ");
        // for (int i = top; i >= 0; i--) {
        //     System.out.println(data[i] + " ");
        // }
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tglPembelian + " " +
            data[i].jmlBarang + " " + data[i].total);
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
    
    public struk getMax() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return null;
        } else {
            struk maxStruk = data[0];
            for (int i = 1; i <= top; i++) {
                if (data[i].total > maxStruk.total) {
                    maxStruk = data[i];
                }
            }
            return maxStruk;
        }
    }
}