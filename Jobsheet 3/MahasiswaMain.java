import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jmlMahasiswa];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("\nInfo Mahasiswa: ");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.cetakInfo();
        }

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.Ipk();
        } 

        double rataRataIpk = totalIpk / jmlMahasiswa;
        double ipk2 = Math.round(rataRataIpk * 10.0) / 10.0;

        System.out.println("\nRata - rata IPK: " + ipk2);

        sc.close();
    }
}
