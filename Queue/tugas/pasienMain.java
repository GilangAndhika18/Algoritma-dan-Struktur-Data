package tugas;

import java.util.Scanner;

public class pasienMain {
    
    public static void menu() {
        System.out.println("=====================");
        System.out.println("Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Paling Belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Exit");
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kapasitas Queue: ");
        int jumlah = sc.nextInt();
        queue antri = new queue(jumlah);

        int pilih;
        boolean choose = true;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    char jenisKelamin = sc.nextLine().charAt(0);
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    pasien pas = new pasien(nama, id, jenisKelamin, umur);
                    sc.nextLine();
                    antri.enqueue(pas);
                    continue;
                case 2:
                    pasien data = antri.dequeue();
                    if (!"".equals(data.nama) && data.noID != 0 && 
                    data.jenisKelamin != '\u0000' && data.umur != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noID +
                        " " + data.jenisKelamin + " " + data.umur);
                        continue;
                    }
                case 3:
                    antri.peek();
                    continue;
                case 4:
                    antri.peekRear();
                    continue;
                case 5:
                    antri.print();
                    continue;
                case 6:
                    choose = false;
                    break;
            }
        } while (choose);
    }
}
