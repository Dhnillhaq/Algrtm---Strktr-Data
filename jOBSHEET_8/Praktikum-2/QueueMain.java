import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Terbelakang");
        System.out.println("5. Cetak Semua Antrian");
        System.out.println("6. Keluar");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int capasity = sc.nextInt();
        Queue2 antre = new Queue2(capasity);

        doLoop: do {
            menu();
            int mauApa = sc.nextInt();
            switch (mauApa) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    System.out.print("Masukkan nomor rekening: ");
                    String no = sc.next();
                    System.out.print("Masukkan nama: ");
                    String nm = sc.next();
                    System.out.print("Masukkan Alamat: ");
                    String Alamat = sc.next();
                    System.out.print("Masukkan umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Masukkan saldo: ");
                    double sdo = sc.nextDouble();
                    sc.nextLine();
                    Nasabah dt = new Nasabah(no, nm, Alamat, umur, sdo);
                    antre.Enqueue(dt);
                    break;
                case 2:
                    if (!antre.isEmpty()) {
                        Nasabah data = antre.Dequeue();
                        System.out.println("\n" + antre.size);
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.Alamat
                                + " " + data.umur + " " + data.saldo);
                    } else {
                        System.out.println("\n" + antre.size);
                        System.out.println("tes");
                    }
                    break;
                case 3:
                    antre.peekFront();
                    break;
                case 4:
                    antre.peekRear();
                    ;
                    break;
                case 5:
                    antre.print();
                    break;
                case 6:
                    break doLoop;
                default:
                    System.out.println("Input tidak valid, Coba lagi dengan inputan sesuai menu");
                    break;
            }
        } while (true);

    }
}
