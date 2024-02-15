import java.util.Scanner;

public class pemilihan_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
       

        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        

        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        

        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();

        System.out.println("=================");

        int tk = tugas + kuis;
        double nilaiAkhir = 0.2 * tk + 0.3 * uts + 0.3 * uas;
        System.out.println("=================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("=================");
            System.out.println("=================");
            return;
        }


        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf: A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf: B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf: B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf: C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf: D");
        } else {
            System.out.println("Nilai Huruf: E");
        }
        System.out.println("=================");
        System.out.println("=================");

        if (nilaiAkhir > 50) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        
    }
    
}