package Latihan;

import java.util.Scanner;

public class BeliMain {
    public static void menu() {
        System.out.println("\nPilih menu: ");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Terbelakang");
        System.out.println("5. Cek Nomor Antrian");
        System.out.println("6. Cetak Semua Antrian");
        System.out.println("7. Keluar");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int capasity = sc.nextInt();
        QiwQiw cobaIn = new QiwQiw(capasity);
        doLoop: do {
            menu();
            System.out.print("$> ");
            int piliah = sc.nextInt();

            switch (piliah) {
                case 1:
                    System.out.print("Masukkan nama anda: ");
                    String nama = sc.next();
                    System.out.print("Masukkan nomor hp anda: ");
                    int noHp = sc.nextInt();
                    Pembeli wihDataMasuk = new Pembeli(nama, noHp);
                    cobaIn.Enqueue(wihDataMasuk);
                    break;
                case 2:
                    Pembeli data = cobaIn.Dequeue();
                    System.out.println("Data yang keluar: " + data.nama + " " + data.noHp);
                    break;
                case 3:
                    cobaIn.peekHead();
                    break;
                case 4:
                    cobaIn.peekTail();
                    break;
                case 5:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String cariNama = sc.next();
                    sc.nextLine();
                    cobaIn.peekPosition(cariNama);
                    break;
                case 6:
                    cobaIn.print();
                    break;
                case 7:

                    break doLoop;

                default:
                    break;
            }
        } while (true);
    }
}
