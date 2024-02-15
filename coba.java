import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Angka untuk MK Pancasila : ");
        double mk1 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi : ");
        double mk2 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving : ");
        double mk3 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Matematika Dasar : ");
        double mk4 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris : ");
        double mk5 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman : ");
        double mk6 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman : ");
        double mk7 = scanner.nextDouble();

        System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja : ");
        double mk8 = scanner.nextDouble();

        double[] bobot = {3.5, 4.0, 3.0, 4.0, 4.0, 2.5, 2.5, 4.0};
        double jumlahBobot = 0;

        double[] mk = {mk1, mk2, mk3, mk4, mk5, mk6, mk7, mk8};
        String[] nilaiHuruf = new String[8];

        String[] namaMatkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar",
        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < bobot.length; i++) {
            jumlahBobot += bobot[i];
            double nilaiHurufTemp = convertToGradePoint(mk[i]);
            nilaiHuruf[i] = convertToLetterGrade(nilaiHurufTemp);
            System.out.printf("%-30s %-15.2f %-15s %-15.2f\n", namaMatkul[i], mk[i], nilaiHuruf[i], nilaiHurufTemp * bobot[i]);
        }
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("%-45s %-15.2f\n", "Jumlah", getTotalNilai(mk, bobot));
        System.out.printf("%-45s %-15.2f\n", "Jumlah Bobot", jumlahBobot);
        System.out.printf("%-45s %-15.2f\n", "IPK Semester", getTotalNilai(mk, bobot) / jumlahBobot);
    }

    public static String convertToLetterGrade(double nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 80) {
            return "A-";
        } else if (nilai >= 75) {
            return "B+";
        } else if (nilai >= 70) {
            return "B";
        } else {
            return "E";
        }
    }

    public static double convertToGradePoint(double nilai) {
        if (nilai >= 85) {
            return 4.0;
        } else if (nilai >= 80) {
            return 3.7;
        } else if (nilai >= 75) {
            return 3.3;
        } else if (nilai >= 70) {
            return 3.0;
        } else {
            return 0.0;
        }
    }

    public static double getTotalNilai(double[] nilai, double[] bobot) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += convertToGradePoint(nilai[i]) * bobot[i];
        }
        return total;
    }
}
