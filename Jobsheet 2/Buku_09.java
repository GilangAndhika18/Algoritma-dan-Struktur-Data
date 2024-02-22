public class Buku_09 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (jml > 0) {
            stok -= jml;
            if (jml < 0) {
                stok = 0;
            }
        } else {
            System.out.println("Stok Habis!");
        }
        
    }

    void restock(int jml) {
        stok += jml;
    }

    int gantiHarga(int hrg) {
        harga = hrg;

        return hrg;
    }

    public Buku_09(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
    
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int totalHarga) {
        int diskon = 0;

        if (totalHarga > 150000) {
            diskon = 12 * totalHarga / 100;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            diskon = 5 * totalHarga / 100;
        }

        return diskon;
    }

    int hitungHargaBayar(int totalHarga, int diskon) {
        return totalHarga - diskon;
    }
    
}