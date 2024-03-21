package minggu5;


public class Faktorial {

    public int nilai;

    int faktorialBF(int n) {
        long startTime = System.currentTimeMillis();
        
        int faktor = 1;
        // for (int i = 1; i <= n; i++) {
        //     faktor = faktor * i;
        // }
        int i = 1;
        while (i <= n) {
            faktor = faktor * i;
            i++;
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Waktu eksekusi (Brute Force) : " + elapsedTime);

        return faktor;
    }

    int faktorialDC(int n) {
        long startTime = System.currentTimeMillis();

        if (n==1) {
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Waktu eksekusi (Divide Conquer) : " + elapsedTime);
            
            return 1;
        } else {
            int faktor = n * faktorialDC(n-1);

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Waktu eksekusi (Divide Conquer) : " + elapsedTime);

            return faktor;
        }
    }
    
}