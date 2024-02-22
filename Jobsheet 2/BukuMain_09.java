public class BukuMain_09 {
    public static void main(String[] args) {
        Buku_09 bk1 = new Buku_09(null, null, 0, 0, 0);
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku_09 bk2 = new Buku_09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        int totalHargaBk1 = bk1.hitungHargaTotal(5);
        int diskonBk1 = bk1.hitungDiskon(totalHargaBk1);
        int hitungHargaBayarBk1 = bk1.hitungHargaBayar(totalHargaBk1, diskonBk1);

        System.out.println("Harga Total Buku 1: Rp " + totalHargaBk1);
        System.out.println("Diskon Buku 1: Rp " + diskonBk1);
        System.out.println("Harga Bayar Buku 1: Rp " + hitungHargaBayarBk1);

        int totalHargaBk2 = bk2.hitungHargaTotal(11);
        int diskonBk2 = bk2.hitungDiskon(totalHargaBk2);
        int  hitungHargaBayarBk2 = bk2.hitungHargaBayar(totalHargaBk2, diskonBk2);

        System.out.println("Harga Total Buku 2: Rp " + totalHargaBk2);
        System.out.println("Diskon Buku 2: Rp " + diskonBk2);
        System.out.println("Harga Bayar Buku 2: Rp " + hitungHargaBayarBk2);

    }
}
