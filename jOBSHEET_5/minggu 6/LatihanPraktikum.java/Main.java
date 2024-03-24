public class Main {
 public static void main(String[] args) {
    HotelService smwHotel = new HotelService();
    Hotel h1 = new Hotel("Hometown", "Padang", 1000000, (byte) 5);
    Hotel h2 = new Hotel("Lucky", "Jakarta", 120000, (byte) 4);
    Hotel h3 = new Hotel("Grand", "Surabaya", 320000, (byte) 3);
    Hotel h4 = new Hotel("Everyday", "Malang", 150000, (byte)5);

    smwHotel.tambah(h1);
    smwHotel.tambah(h2);
    smwHotel.tambah(h3);
    smwHotel.tambah(h4);
    smwHotel.tampil();
    System.out.println("Hotel dari yang termurah: (Menggunakan Bubble Sort)");
    smwHotel.bsHarga();
    System.out.println("Hotel dari yang termurah: (Menggunakan Selection Sort)");
    smwHotel.sSHarga();
    System.out.println("Menampilkan Daftar Hotel dari bintang tertinggi: (Menggunakan Bubble Sort)");
    smwHotel.bsBintang();
    System.out.println("Menampilkan Daftar Hotel dari bintang tertinggi: (Menggunakan Selection Sort)");
    smwHotel.sSBintang();

   }    
}
