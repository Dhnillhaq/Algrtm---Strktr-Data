public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama\t    : " + nama);
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("Umur\t    : " + umur);
        System.out.println("IPK\t    : " + ipk);
    }
}