import java.util.Scanner;

public class Utama17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean test;
        System.out.println("Selamat Datang di Gudang 17!");
        System.out.print("Isi Batas kapasitas muatan tumpukan: ");
        int bnyk = sc.nextInt();
        Gudang17 gudang = new Gudang17(bnyk);
        Loop:
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = sc.nextLine();
                    Barang17 newBarang = new Barang17(kode, nama, kategori);
                    gudang.tambahBarang(newBarang);
                    break;
                case 2:
                    gudang.ambilBarang17();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                System.out.print("Masukkan kode barang yang ingin dicari: ");
                int cari = sc.nextInt();
                    System.out.println(gudang.cari(cari)); 
                    break;
                case 7:
                
                    break Loop;

                default:
                System.out.println("Pilihan Tidak Valid! Coba Lagi..");
                    break;
            }
        }
    }
}
