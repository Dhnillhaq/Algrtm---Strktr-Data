import java.util.Scanner;

public class BukuMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PencarianBuku17 data = new PencarianBuku17();
        int jumlahBuku = 5;

        System.out.println("---------------------------------------------------");
        System.out.println("Masukkan data buku secara Urut dari KodeBuku Terkecil: ");
        // for (int i = 0; i < jumlahBuku; i++) {
        // System.out.println("-------------------------");
        // System.out.print("Kode Buku\t : ");
        // int kodeBuku = sc.nextInt();
        // System.out.print("Judul Buku\t : ");
        // String judulBuku = sc.next();
        // sc.nextLine();
        // System.out.print("Tahun Terbit\t : ");
        // int tahunTerbit = sc.nextInt();
        // System.out.print("Pengarang\t : ");
        // String pengarang = sc.next();
        // sc.nextLine();
        // System.out.print("Stok\t\t : ");
        // int stok = sc.nextInt();
        // Buku17 m = new Buku17(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
        // data.tambah(m);
        // }
        // Buku Dummy Data Random
        Buku17 m2 = new Buku17("20213", "Koran Siakad", 2019, "JohnDahlan", 10);
        data.tambah(m2);
        Buku17 m5 = new Buku17("20212", "Komik Sijuki", 2019, "Watashi", 10);
        data.tambah(m5);
        Buku17 m1 = new Buku17("20215", "Novel Abdul", 2019, "Park TaeJoon", 10);
        data.tambah(m1);
        Buku17 m4 = new Buku17("20214", "Novel Abdul", 2019, "FaisalAkbar", 10);
        data.tambah(m4);
        Buku17 m3 = new Buku17("20211", "Novel Naruto", 2019, "Wahyu", 10);
        data.tambah(m3);
        System.out.println("---------------------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();
        System.out.println("_______________________________________________");
        System.out.println("_______________________________________________");
        System.out.println("Pencarian Data ");
        System.out.print("Kode Buku : ");
        System.out.println("Apa yang ingin anda cari? \n1.Kode Buku \n2.Judul Buku");
        System.out.print("$> ");
        int choice = sc.nextInt();
        sc.nextLine();
        data.sortingAsc(choice);
        System.out.println("Data Setelah diurutkan : ");
        data.tampil();
        System.out.print("Masukkan kata kunci : ");
        String cari = sc.nextLine();
        int posisi = 0;

        // System.out.println("Menggunakan sequential Search");
        // posisi = data.findSeqSearch(cari);

        // data.tampilPosisi(cari, posisi);

        // Buku17 dataBuku = data.FindBuku(cari);
        // dataBuku.tampilData();

        System.out.println("======================================================");
        System.out.println("Menggunakan binary Search");
        switch (choice) {
            case 1:
                posisi = data.findBinarySearchKB(cari, 0, jumlahBuku - 1);
                System.out.println(posisi);
                data.tampilPosisi(cari, posisi);
                data.tampilData(cari, posisi);
                break;
            case 2:
                posisi = data.findBinarySearchJudul(cari, 0, jumlahBuku - 1);
                System.out.println(posisi);
                if (posisi == -1) {
                    System.out.println("Data tidak ditemukan");
                } else if (posisi == -2) {
                    System.out.println("Warning, Data Lebih dari Satu! (terdapat duplikasi judul)");
                } else {
                    data.tampilPosisi(cari, posisi);
                    data.tampilData(cari, posisi);
                }
                break;

            default:
            System.out.println("Pilihan Tidak Tersedia");
                break;
        }
        // try {
        // if (posisi == -2) {
        // throw new Exception("[WARNING] Data Lebih dari Satu! (terdapat duplikasi
        // judul)");
        // } else {
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
        // }
        // // data.TampilposisiStr(cari, posisi);
        // // data.TampilDataStr(cari, posisi);
        // }
        // catch (Exception err) {
        // System.out.println("LOG:\n " + err + "\nENDLOG");
        // }
    }
}
