package minggu5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultipleCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Program menghitung keuntungan total perusahaan (Satuan Juta. Misal 1.5)");
        System.out.print("\nMasukkan jumlah perusahaan: ");
        int companies = sc.nextInt();

        int[] bulan = new int[companies];

        double[][] profits = new double[companies][];

        for (int i = 0; i < companies; i++) {
            System.out.print("\nMasukkan jumlah bulan untuk perusahaan ke-" + (i+1) + " : ");
            bulan[i] = sc.nextInt();

            profits[i] = new double[bulan[i]];

            for (int j = 0; j < bulan[i]; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j+1) + 
                " untuk perusahaan ke-" + (i+1) + " : ");
                profits[i][j] = sc.nextDouble();
            }
        }

        System.out.println("========================");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < companies; i++) {
            double totalProfit = calculateTotalProfit(profits[i]);
            System.out.println("\nTotal keuntungan perusahaan ke-" + (i+1) + " selama " + bulan[i] + " bulan adalah " + decimalFormat.format(totalProfit));   
        }
    }

    public static double calculateTotalProfit(double[] profits) {
        double total = 0;
        for (double profit : profits) {
            total += profit;
        }
        return total;
    }
}
