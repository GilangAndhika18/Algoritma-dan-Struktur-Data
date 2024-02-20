import java.util.Scanner;

public class TugasNo1_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char plat[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        char kota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        

        System.out.print("Masukkan kode plat: ");
        String hurufPlat = sc.nextLine();
        String namaKota = "";

        boolean found = false;
        for (int i = 0; i < plat.length; i++) {
            if (plat[i] == hurufPlat.charAt(0)) {
                for (int j = 0; j < kota[i].length; j++) {
                    namaKota += kota[i][j];
                }
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Plat " + hurufPlat + " dari kota " + namaKota);
        } else {
            System.out.println("Plat atau kota tidak ada!");
        }
    }
}
