package minggu5;

import java.util.Scanner;

public class Akar09 {
    static double squareRootBF(int n) {
        if (n == 0 || n == 1) 
            return n;

            double hasil = 1;
            for (int i = 1; i <= n; i++) {
                if (i * i == n) {
                    hasil = i;
                    break;
                } else if (i * i > n) {
                    hasil = i - 1;
                    break;
                }
        }
        return hasil;
    }

    static double squareRootDC(int n) {
        if (n == 0 || n == 1) 
            return n;

        double low = 0;
        double high = n;
        double epsilon = 0.00001;

        while (high - low > epsilon) {
            double mid = (low + high) /2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid;
            } else {
                high = mid;
            }
            
        }
        return low;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka:");
        int number = sc.nextInt();

        double hasilBF = squareRootBF(number);
        double hasilDC = squareRootDC(number);

        System.out.println("\nHasil akar dengan Brute Force: " + (int)hasilBF);
        System.out.println("Hasil akar dengan Divide Conquer: " + (int)hasilDC);
    }
}
