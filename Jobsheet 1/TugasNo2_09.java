import java.util.Scanner;

public class TugasNo2_09 {

    public static double hitungKecepatan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Rumus hitung kecepatan : v = s/t");
        System.out.print("Masukkan s(jarak): ");
        double s = sc.nextDouble();

        System.out.print("Masukkan t(waktu): ");
        double t = sc.nextDouble();

        double v = s / t;

        System.out.println("Kecepatan : " + v);
        System.out.println("====================");

        System.out.println();

        return v;
    }

    public static double hitungJarak()  {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("Rumus hitung jarak : s = v.t");
        System.out.print("Masukkan v(kecepatan): ");
        double v = sc.nextDouble();
        System.out.print("Masukkan t(waktu): ");
        double t = sc.nextDouble();

        double s = v * t;

        System.out.println("Jarak : " + s);
        System.out.println("====================");

        System.out.println();

        return s;
    }

    public static double hitungWaktu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Rumus hitung waktu : t = s/v");
        System.out.print("Masukkan s(jarak): ");
        double s = sc.nextDouble();
        System.out.print("Masukkan v(kecepatan): ");
        double v = sc.nextDouble();

        double t = s / v;

        System.out.println("Waktu : " + t);
        System.out.println("====================");

        System.out.println();

        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("====================");
            System.out.println("Pilih Menu: ");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Exit");
            System.out.print("Input: ");
            menu = sc.nextInt();
            System.out.println("====================");

            System.out.println();
            

            switch (menu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;

                case 3:
                    hitungWaktu();
                    break;

                case 4:
                    System.out.println("====================");
                    System.out.println("Terimakasih!");
                    System.out.println("====================");
                    break;
            
                default:
                    System.out.println("Menu tidak ada!!");
            }
            
        } while (menu != 4);

        
    }
}
