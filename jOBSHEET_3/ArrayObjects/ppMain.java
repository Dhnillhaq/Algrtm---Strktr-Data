package ArrayObjects;
import java.util.Scanner;

public class ppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak persegi panjang yang ingin anda buat: ");
        int panjangArray = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];


        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke - "+ (i+1));
            System.out.print("Masukkan Panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
            System.out.println();
        }
        
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println();
            System.out.println("Persegi Panjang ke - " + (i+1));
            System.out.println("Panjang : "+ppArray[i].panjang+", Lebar : " +ppArray[i].lebar);
        }
    }
}
