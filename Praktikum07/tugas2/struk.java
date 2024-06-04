package tugas2;

public class struk {
    
    int noTransaksi, jmlBarang, total;
    String tglPembelian;

    public struk(int noTransaksi, String tglPembelian, int jmlBarang, int total) {
        this.noTransaksi = noTransaksi;
        this.tglPembelian = tglPembelian;
        this.jmlBarang = jmlBarang;
        this.total = total;
    }

    public String toString() {
        return "No Transaksi: " + noTransaksi + ", Tanggal Pembelian: " + tglPembelian 
        + ", Jumlah Barang: " + jmlBarang + ", Total Harga: " + total;
    }
}
