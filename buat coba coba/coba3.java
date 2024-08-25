import java.util.Arrays;
import java.util.Scanner;

public class coba3 {

    public static int binarySearch(String arr[], String a) {
        int left = 0, right = arr.length - 1;
    
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int resultCompare = a.compareTo(arr[middle]);
    
            if (resultCompare == 0) {
                return middle;
            }
    
            if (resultCompare > 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    
        return - 1;
    }

    public static int sequintialSearch(String arr[], String b) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(b)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama[] = {"Adi", "Bagas", "Rusdi", "Budi", "Pace"};

        // Arrays.sort(nama);

        System.out.print("Masukkan nama: ");
        String find = sc.nextLine();

        // int result = binarySearch(nama, find);
        int result = sequintialSearch(nama, find);

        if (result != -1) {
            System.out.println("Nama ditemukan di indeks ke-" + result);
        } else {
            System.out.println("Nama tidak ditemukan!");
        }

        sc.close();


    }
}
