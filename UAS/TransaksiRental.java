public class TransaksiRental {
    
    int kdTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;
    BarangRental br;

    public TransaksiRental(int kdTransaksi, String namaPeminjam, int lamaPinjam,
     double totalBiaya, BarangRental br) {
        this.kdTransaksi = kdTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
    }
    
}
