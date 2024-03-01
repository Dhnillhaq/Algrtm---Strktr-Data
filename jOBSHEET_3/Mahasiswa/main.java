package Mahasiswa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaTes[] data = new MahasiswaTes[3];
        for (int i = 0; i < data.length; i++) {
            data[i] = new MahasiswaTes();
            System.out.println("Masukkan data Mahasiswa ke - " + (i + 1));
            System.out.print("Masukkan nama: ");
            data[i].nama = sc.nextLine();
            System.out.print("Masukkan nim: ");
            data[i].NIM = sc.nextLine();
            System.out.print("Masukkan jenis Kelamin: ");
            data[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            data[i].iPK = sc.nextDouble();
            System.out.println();
            sc.nextLine();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1) + ":");
            System.out.println("nama: " + data[i].nama);
            System.out.println("NIM: " + data[i].NIM);
            System.out.println("Jenis Kelamin: " + data[i].jenisKelamin);
            System.out.println("IPK: " + data[i].iPK);
            System.out.println();
        }

        System.out.printf("Rata Rata IPK Mahasiswa adalah: %.1f",
                data[0].hitungRataIPK(data[0].iPK, data[1].iPK, data[2].iPK));
        System.out.print("\n\nIPK Mahasiswa Terbesar adalah,\nSELAMAT KEPADA ANANDA: \n");
        for (int i = 0; i < data.length; i++) {
            if (data[i].iPK == data[0].terbesar(data[0].iPK, data[1].iPK, data[2].iPK)) {
                System.out.println("nama: " + data[i].nama);
                System.out.println("NIM: " + data[i].NIM);
                System.out.println("Jenis Kelamin: " + data[i].jenisKelamin);
                System.out.println("IPK: " + data[i].iPK);
                System.out.println();
            }

        }
    }
}
