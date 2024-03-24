package BangunRuang;

import java.util.Scanner;

public class BRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kerucut[] kArray = new Kerucut[2];
        LimasSegi4[] lArray = new LimasSegi4[2];
        Bola[] bArray = new Bola[2];                       
        
        // Looping untuk mengisi atribut Bola
        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = new Bola();
            System.out.print("Masukkan jari jari Bola ke - "+ i +" : ");
            bArray[i].jari2 = sc.nextInt();
        }
        // Looping untuk mengisi atribut Limas Segi Empat
        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = new LimasSegi4();
            System.out.print("Masukkan sisiALas Limas ke - "+ i +" : ");
            lArray[i].sisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi Limas ke - "+ i +" : ");
            lArray[i].tinggi = sc.nextInt();
        }
        // Looping untuk mengisi atribut Kerucut
        for (int i = 0; i < kArray.length; i++) {
            kArray[i] = new Kerucut();
            System.out.print("Masukkan jari jari Kerucut ke - "+ i +" : ");
            kArray[i].jari2 = sc.nextInt();
            System.out.print("Masukkan sMiring Kerucut ke - "+ i +" : ");
            kArray[i].sMiring= sc.nextInt();
        }

        for (int i = 0; i < bArray.length; i++) {
            System.out.printf("LP Bola ke - " + i +": %.1f", bArray[i].hitungLPBola(bArray[i].jari2));
            System.out.printf("\nVolume Bola ke - "+i+": %.1f\n", bArray[i].hitungVolumeBola(bArray[i].jari2));
        }

        for (int i = 0; i < lArray.length; i++) {
            System.out.printf("\nLP Limas ke - " + i +": %.1f", lArray[i].hitungLPLimas(lArray[i].sisiAlas, lArray[i].tinggi));
            System.out.printf("\nVolume Limas ke - " + i +": %.1f\n", lArray[i].hitungVolumeLimas(lArray[i].sisiAlas, lArray[i].tinggi));
        }

        for (int i = 0; i < kArray.length; i++) {
            System.out.printf("\nLP Kerucut ke - " + i +": %.1f", kArray[0].hitungLPKerucut(kArray[i].jari2, kArray[i].sMiring));
            System.out.printf("\nVolume Kerucut ke - " + i +": %.1f\n", kArray[0].hitungVolumeKerucut(kArray[i].jari2, kArray[i].sMiring));
        }

    }
}
