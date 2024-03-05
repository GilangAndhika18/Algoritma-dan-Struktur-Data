public class Mahasiswa {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }

    double Ipk() {
        return ipk;
    }
}
