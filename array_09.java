import java.util.Scanner;

public class array_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk= {"Agama", "Bahasa Indo", "English", "KTI", "CTPS", "PAMB", "Matematika", "Daspro", "PrakDaspro"};
        String[] nilaiHuruf = new String[mk.length];
        double[] bobotNilai = new double[mk.length];
        double[] nilaiMk = new double[mk.length];
        int[] sks = {2,2,2,2,2,2,2,2,3};

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan Nilai Angka " + mk[i] + ": ");
            nilaiMk[i] = sc.nextDouble();
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        for (int i = 0; i < nilaiMk.length; i++) {
            if (nilaiMk[i] > 80 && nilaiMk[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            } else if (nilaiMk[i] > 73 && nilaiMk[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiMk[i] > 65 && nilaiMk[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilaiMk[i] > 60 && nilaiMk[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiMk[i] > 50 && nilaiMk[i] <= 65) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilaiMk[i] > 39 && nilaiMk[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilaiMk[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }

            
        }
        int totalSks = 0;

            for (int i = 0; i < sks.length; i++) {
                totalSks += sks[i];
            }

            double[] temp = new double[sks.length];
            for (int i = 0; i < sks.length; i++) {
                
            temp[i] = bobotNilai[i] * sks[i];
            }

            double ip = 0;

            for (int i = 0; i < temp.length; i++) {
                ip += temp[i];
            }

            double totalIp = ip / totalSks;

            System.out.println();
            System.out.println("MK       Nilai Angka      Nilai Huruf      Bobot Nilai");
            for (int i = 0; i < mk.length; i++) {
                System.out.printf("%-12s%-15s%-15s%-10s\n", mk[i], nilaiMk[i], nilaiHuruf[i], bobotNilai[i]);
            }

            System.out.println("IP: " + totalIp);
    }
}
