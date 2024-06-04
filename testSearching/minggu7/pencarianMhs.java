package minggu7;

import java.util.Arrays;
import java.util.Comparator;

public class pencarianMhs {
    
    // mahasiswa listMhs[] = new mahasiswa[5];
    mahasiswa listMhs[];
    int idx;

    pencarianMhs(int jumlah) {
        listMhs = new mahasiswa[jumlah];
        idx = 0;
    }

    void tambah(mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("-------------------------");
        }
    }

    void sortByName() {
        Arrays.sort(listMhs, Comparator.comparing(mahasiswa -> mahasiswa.nama));
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // public int findBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2; //proses divide
    //         if (cari == listMhs[mid].nim) {
    //             return(mid); //proses conquer 1
    //         } else if (listMhs[mid].nim < cari) {
    //             return findBinarySearch(cari, left, mid -1); //proses conquer 2
    //         } else {
    //             return findBinarySearch(cari, mid +1, right); //proses conquer 3
    //         }
    //     }
    //     return -1;
    // }

    public int findBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) /2;
            if (listMhs[mid].nama.equals(cari)) {
                return mid;
            } else if (listMhs[mid].nama.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + x);
            System.out.println("Umur\t : " +listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void cariSemua(String cari) {
        int firstPos = findBinarySearch(cari, 0, listMhs.length -1);
        if (firstPos == -1) {
            System.out.println("Data " + cari + " tidak ditemukan");
            return;
        }

        int left = firstPos, right = firstPos;
        while (left > 0 && listMhs[left -1].nama.equals(cari)) {
            left--;
        }
        while (right < listMhs.length -1 && listMhs[right +1].nama.equals(cari)) {
            right++;
        }

        for (int i = left; i <= right; i++) {
            tampilData(cari, i);
            System.out.println("--------------------------");
        }

        if (right - left > 0) {
            System.out.println("Peringatan: Ada lebih dari satu hasil!");
        }
    }
}
