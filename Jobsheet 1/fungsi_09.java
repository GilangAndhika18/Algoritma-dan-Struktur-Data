public class fungsi_09 {

    static String[] royalGarden = {"Royal Garden 1","Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static int[][] stok =
    { 
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };
    static int[] hargaBunga = {75_000, 50_000, 60_000, 10_000};
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void pendapatanTiapCabang() {
        System.out.println("Pendapatan tiap cabang: ");
        for (int i = 0; i < royalGarden.length; i++) {
            int total = 0;
            for (int j = 0; j < stok[i].length; j++) {
                total += stok[i][j] * hargaBunga[j];
            }
            System.out.println(royalGarden[i] + ": RP " + total);
        }
    }

    public static void stokCabang4() {
        int[] stokBunga = new int[4];

        for (int j = 0; j < stok[3].length; j++) {
            stokBunga[j] = stok[3][j];
        }

        stokBunga[0] -= 1;
        stokBunga[1] -= 2;
        stokBunga[2] -= 0;
        stokBunga[3] -= 5;

        System.out.println("\nStok bunga cabang 4: ");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println(namaBunga[i] + ": " + stokBunga[i]);
        }
    }


        public static void main(String[] args) {
        pendapatanTiapCabang();
        stokCabang4();
    }
}
