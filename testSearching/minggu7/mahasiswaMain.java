package minggu7;

import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        pencarianMhs data = new pencarianMhs(jumMhs);

        // pencarianMhs data = new pencarianMhs();
        // int jumMhs = 5;
        

        System.out.println("---------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------");
            System.out.print("Nim\t :");
            int nim = s.nextInt();
            System.out.print("Nama\t :");
            String nama = sl.nextLine();
            System.out.print("Umur\t :");
            int umur = s.nextInt();
            System.out.print("IPK\t :");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);

        }

        data.sortByName();

            System.out.println("---------------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa : ");
            data.tampil();

            System.out.println("---------------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("Pencarian Data : ");
            System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
            System.out.print("Nama :");
            String cari = sl.nextLine();
            // System.out.println("menggunakan sequintial Search");
            // int posisi = data.findSeqSearch(cari);
            // data.tampilPosisi(cari, posisi);
            // data.tampilData(cari, posisi);

            System.out.println("---------------------------------------------");
            System.out.println("menggunakan binary Search");
            // posisi = data.findBinarySearch(cari, 0, jumMhs -1);
            // data.tampilPosisi(cari, posisi);
            // data.tampilData(cari, posisi);
            data.cariSemua(cari);
    }
}
