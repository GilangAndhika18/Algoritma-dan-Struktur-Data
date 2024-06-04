package tugas2;

public class mainStruk {
    public static void main(String[] args) {
        stack struk = new stack(10);

        struk.push(new struk(101, "2024-04-07", 5, 200000));
        struk.push(new struk(102, "2024-04-14", 3, 150000));
        struk.push(new struk(103, "2024-04-21", 7, 300000));
        struk.push(new struk(104, "2024-04-28", 4, 250000));
        struk.push(new struk(105, "2024-05-05", 6, 220000));
        struk.push(new struk(106, "2024-05-12", 2, 180000));
        struk.push(new struk(107, "2024-05-19", 8, 400000));
        struk.push(new struk(108, "2024-05-26", 5, 230000));

        System.out.println("Struk yang diturkankan dengan voucher: ");
        for (int i = 0; i < 5; i++) {
            struk.pop();
        }

        System.out.println("Struk yang masih tersimpan di dalam stack: ");
        struk.print();
    }
}
