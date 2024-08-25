package jobsheet6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel h1 = new Hotel("Hotel A", "Surabaya", 2000000, (byte) 5);
        Hotel h2 = new Hotel("Hotel B", "Surabaya", 1000000, (byte) 3);
        Hotel h3 = new Hotel("Hotel C", "Malang", 500000, (byte) 2);
        Hotel h4 = new Hotel("Hotel D", "Probolinggo", 250000, (byte) 1);
        Hotel h5 = new Hotel("Hotel E", "Jakarta", 1500000, (byte) 4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum sorting");
        list.tampilAll();

        System.out.println("\nData Hotel setelah disorting harga");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("\nData Hotel setelah disorting bintang");
        list.selectionSort();
        list.tampilAll();


    }
}
