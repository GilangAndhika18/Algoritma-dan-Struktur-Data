package jobsheet6;

public class HotelService {
    Hotel rooms[] = new Hotel[5];

    int id;
    void tambah(Hotel h) {
        if (id < rooms.length) {
            rooms[id] =h;
            id++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            h.tampil();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[minIndex].bintang) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
