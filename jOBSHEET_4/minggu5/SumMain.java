import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum[] sm = new Sum[10];
        System.out.println("====================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Berapa Perusahaan yang akan ada (Max 10)? ");
        System.out.print("\n:> ");
        int Perusahaan = sc.nextInt();
        for (int i = 0; i < Perusahaan; i++) {
            System.out.println("\n====================================================================");
            System.out.print("Masukkan jumlah bulan pada perusahaan ke - "+(i+1)+": ");
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke - "+(j+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < Perusahaan; i++) {
            
            System.out.println("\n====================================================================");
            System.out.println("Keuntungan Perusahaan ke - "+(i+1)+" menggunakan Algoritma Brute Force: ");
            System.out.println("Total Keuntungan selama "+sm[i].elemen+ " bulan adalah = "+sm[i].totalBF(sm[i].keuntungan));
            System.out.println("\n====================================================================");
            System.out.println("Keuntungan Perusahaan ke - "+(i+1)+" menggunakan Algoritma Divide and Conquer: ");
            System.out.println("Total Keuntungan selama "+sm[i].elemen+ " bulan adalah = "+sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        }        
    }
}
