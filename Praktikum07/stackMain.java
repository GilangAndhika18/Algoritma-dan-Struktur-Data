import java.util.Scanner;

public class stackMain {
    public static void main(String[] args) {
        stack stk = new stack(5);
        Scanner sc = new Scanner(System.in);

        // char pilih;
        // do {
        //     System.out.print("Jenis: ");
        //     String jenis = sc.nextLine();
        //     System.out.print("Warna: ");
        //     String warna = sc.nextLine();
        //     System.out.print("Merk: ");
        //     String merk = sc.nextLine();
        //     System.out.print("Ukuran: ");
        //     String ukuran = sc.nextLine();
        //     System.out.print("Harga: ");
        //     double harga = sc.nextDouble();

        //     pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
        //     System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
        //     pilih = sc.next().charAt(0);
        //     sc.nextLine();
        //     stk.push(p);
        // } while (pilih == 'y');

        // stk.print();
        // stk.pop();
        // stk.peek();
        // stk.print();
        boolean menu = true;
        while (menu) {
            System.out.println("\nMenu: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Get Max");
            System.out.println("6. Exit");
            System.out.print("Input: ");
            String choose = sc.nextLine();

        switch (choose) {
            case "push":
                System.out.print("\nJenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
                sc.nextLine();

                pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
                stk.push(p);
                continue;

            case "print":
                stk.print();
                continue;
            
            case "pop":
                stk.pop();
                continue;

            case "peek":
                stk.peek();
                continue;
            
            case "get max":
                pakaian maxPakaian = stk.getMax();
                if (maxPakaian != null) {
                    System.out.println("Pakaian dengan harga tertinggi: ");
                    System.out.println(maxPakaian.jenis + " " + maxPakaian.warna + " " + 
                    maxPakaian.merk + " " + maxPakaian.ukuran + " " + maxPakaian.harga);
                }
                continue;

            case "exit":
                menu = false;
                break;
        
            
        }
        }
        sc.close();

        
    }
}
