public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    int hitungLuas() {
        int luas = panjang * lebar;

        return luas;
    }

    int hitungKeliling() {
        int keliling = 2 * (panjang + lebar);

        return keliling;
    }
    
    void cetakInfo(int nomor) {
        int luas = hitungLuas();
        int keliling = hitungKeliling();

        System.out.println("Persegi panjang ke- " + nomor +", panjang: " + this.panjang + ", lebar: " + this.lebar
        + ", luas: " + luas + ", keliling: " + keliling);
    }
}