import java.util.Scanner;

public class Main {

    static BarangRental[] kendaraan = new BarangRental[10];
    static TransaksiRental[] transaksi = new TransaksiRental[10];
    static int countKendaraan = 0;
    static int countTransaksi = 0;

    public static void daftarKendaraan() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Daftar Kendaraa Rental Serba Serbi");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("| Nomor TNKB\t|Nama Kendaraan\t\t|Jenis\t\t|Tahun\t\t|Biaya Sewa Perjam");

        for (int i = 0; i < countKendaraan; i++) {
            BarangRental br = kendaraan[i];

            System.out.printf("| %-10s\t|%-20s\t|%-10s\t|%-10d\t|%-10d\n", br.noTNKB,
                    br.namaKendaraan, br.jenisKendaraan, br.tahun, br.biayaSewa);
        }
    }

    public static void peminjaman() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Masukkan Data Peminjaman");
        System.out.println("---------------------------");
        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = sc.nextLine();
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = sc.nextLine();
        System.out.print("Masukkan Lama Pinjam: ");
        int lamaPinjam = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah Member (ya/tidak): ");
        String member = sc.nextLine();

        BarangRental barangDipinjam = null;
        for (int i = 0; i < countKendaraan; i++) {
            if (kendaraan[i].noTNKB.equals(noTNKB)) {
                barangDipinjam = kendaraan[i];
                break;
            }
        }

        if (barangDipinjam == null) {
            System.out.println("Kendaraan tidak ditemukan");
            return;
        }

        boolean diPinjam = false;
        for (int i = 0; i < countTransaksi; i++) {
            if (transaksi[i] != null && transaksi[i].br != null 
            && transaksi[i].br.noTNKB.equals(noTNKB)) {
                diPinjam = true;
                break;
            }
        }

        if (diPinjam) {
            System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain.");
        } else {
            double totalBiaya = lamaPinjam * barangDipinjam.biayaSewa;

            if (member.equalsIgnoreCase("ya")) {
                totalBiaya -= 25000; 
            }

            if (lamaPinjam >= 48 && lamaPinjam <= 78) {
                totalBiaya *= 0.9; 
            } else if (lamaPinjam > 78) {
                totalBiaya *= 0.8; 
            }

            TransaksiRental transaksiBaru = new TransaksiRental(countTransaksi++, namaPeminjam,
                    lamaPinjam, totalBiaya, barangDipinjam);
            transaksi[countTransaksi++] = transaksiBaru;

            System.out.println("kode");
            System.out.println("1");
            System.out.println("No TNKB\t\tNama Barang\t\tNama Peminjam\t\tLama Pinjam\t\tTotal Biaya");
            System.out.printf("%s\t\t%s\t\t%s\t\t%d\t\t%.0f\n", transaksiBaru.br.noTNKB,
                    transaksiBaru.br.namaKendaraan, transaksiBaru.namaPeminjam,
                    transaksiBaru.lamaPinjam, transaksiBaru.totalBiaya);
        }

    }

    public static void seluruhTransaksi() {
        System.out.println("Tampilkan seluruh transaksi");
        System.out.println("| Kode Transaksi\t\tNama Peminjam\t\tNo TNKB\t\tNama Barang\t\tLama Pinjam\t\tTotal Biaya");
        for (int i = 0; i < countTransaksi; i++) {
            if (transaksi[i] != null && transaksi[i].br != null) {
                TransaksiRental transaction = transaksi[i];
                System.out.printf("| %d\t\t%s\t\t%s\t\t%s\t\t%d\t\t%.0f\n", transaction.kdTransaksi,
                        transaction.namaPeminjam, transaction.br.noTNKB,transaction.br.namaKendaraan,
                        transaction.lamaPinjam, transaction.totalBiaya);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        kendaraan[countKendaraan++] = new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        kendaraan[countKendaraan++] = new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        kendaraan[countKendaraan++] = new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        kendaraan[countKendaraan++] = new BarangRental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        kendaraan[countKendaraan++] = new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);

        while (true) {
            System.out.println("=============================");
            System.out.println("Rental Gilang");
            System.out.println("=============================");
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaski urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    daftarKendaraan();
                    break;
                
                case 2:
                    peminjaman();
                    break;

                case 3:
                    seluruhTransaksi();
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        }
    }
}
