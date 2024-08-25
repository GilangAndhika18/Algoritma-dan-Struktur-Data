package quiz2;

import java.util.Scanner;

public class main_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Quiz 2 Praktikum ASD SIB 1B ========");
        System.out.println("Dibuat oleh: Gilang Andhika Erlangga");
        System.out.println("NIM : 2341760129");
        System.out.println("Absen: 09");
        System.out.println("====================================");
        System.out.println("Sistem Antrian Resto Gilang");
        System.out.println("====================================");



        doubleLinkLists_09 myDLL = new doubleLinkLists_09();

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih(1-5): ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-------------------");
                    System.out.println("Masukkan data pembeli");
                    System.out.println("-------------------");
                    System.out.print("Nomor Antrian: ");
                    int noAntrian = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Customer: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    String noHP = sc.nextLine();

                    pembeli_09 pembeli = new pembeli_09(noAntrian, nama, noHP);
                    myDLL.addLast(pembeli);
                    break;
                case 2:
                    myDLL.print();
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.print("Masukkan no antrian yang ingin di hapus");
                    int hapus = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Kode Pesanan: ");
                    int kdPesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Pesanan: ");
                    String pesanan = sc.nextLine();
                    System.out.print("Harga: ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    pesanan_09 pesan = new pesanan_09(kdPesanan, pesanan, harga);
                    try {
                        myDLL.removeByAntrian(hapus);
                        System.out.println("Pesanan berhasil ditambahkan: " + pesan.namaPesanan + " dengan harga " 
                        + pesan.harga);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Pilihanmu ngawur cak!");
                    break;
            }
        }
    }
}
