import java.util.Scanner;

public class coba2 {

    static int bruteForce(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    static int divideConquer(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else {
            int temp = divideConquer(x, y / 2);
            if (y % 2 == 0) {
                return temp * temp;
            } else {
                return x * temp * temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int x = sc.nextInt();

        System.out.print("Masukkan pangkat: ");
        int y = sc.nextInt();

        int result = bruteForce(x, y);
        System.out.println("Hasil pangkat dengan brute force: " + result);

        int result2 = divideConquer(x, y);
        System.out.println("Hasil pangkat dengan divide conquer: " + result2);
    }
    
}