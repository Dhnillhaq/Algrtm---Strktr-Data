import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.print("Masukkan jumlah element: ");
        int element = sc.nextInt();
        Pangkat[] png = new Pangkat[element];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan pangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("--------------");
        System.out.println("Pilih salah satu metode yang ingin anda jalankan: ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print(":> ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
            System.out.println("\nHasil Brute Force");
            for (int i = 0; i < png.length; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
                break;
            case 2:
            System.out.println("\nHasil Divide and Conquer");
            for (int i = 0; i < png.length; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
            break;
            default:
            System.out.println("Inputan yang anda masukkan salah");
                break;
        }
    }
}
