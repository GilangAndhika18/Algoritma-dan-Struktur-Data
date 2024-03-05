import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Nasabah nasabah = new Nasabah("123456", "1234", 500000, "Gilang", "Jatim");
        start(nasabah);
    }
    static void start(Nasabah nasabah) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nomor Rekening: ");
        String nomorRekening = sc.nextLine();

        System.out.print("Masukkan PIN: ");
        String pin = sc.nextLine();

        if (nasabah.login(nomorRekening, pin)) {
            System.out.println("Login Berhasil!");
            while (true) {
                System.out.println("\nMenu: ");
                System.out.println("1. Cek Saldo ");
                System.out.println("2. Tarik Tunai ");
                System.out.println("3. Setor Tunai ");
                System.out.println("4. Keluar ");

                System.out.print("Input menu: ");
                int pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        nasabah.ceksaldo();
                        break;

                    case 2:
                        System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
                        int tarik = sc.nextInt();
                        nasabah.tarikTunai(tarik);
                        break;

                    case 3:
                        System.out.print("Masukkan jumlah uang yang ingin disetor: ");
                        int setor = sc.nextInt();
                        nasabah.setor(setor);
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        return;
                
                    default:
                        System.out.println("Pilihan tidak ada!");
                }
            }
        } else {
            System.out.println("Login gagal!");
        }
    }
}