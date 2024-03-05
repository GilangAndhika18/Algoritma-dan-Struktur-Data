public class Nasabah {
    String noRekening;
    String pin;
    int saldo;
    String nama;
    String namaBank;

    public Nasabah(String noRekening, String pin, int saldo, String nama, String namaBank) {
        this.noRekening = noRekening;
        this.pin = pin;
        this.saldo = saldo;
        this.nama = nama;
        this.namaBank = namaBank;
    }

    public boolean login(String inputNoRek,String inputPin) {
        return inputNoRek.equals(noRekening) && inputPin.equals(inputPin);
    }

    public void ceksaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void tarikTunai(int jml) {
        if (saldo >= jml) {
            saldo -= jml;
            System.out.println("Penarikan tunai berhasil. Sisa saldo: " + saldo);
        } else {
            System.out.println("Saldo mencapai limit!");
        }
    }

    public void setor(int jml) {
        saldo += jml;
        System.out.println("Setor tunai berhasil. Saldo anda sekarang: " + saldo);
    }

        
}
