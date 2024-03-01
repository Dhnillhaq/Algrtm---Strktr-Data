package Mahasiswa;

public class MahasiswaTes {
    public String nama;
    public String NIM;
    public char jenisKelamin;
    public double iPK;
    public double iPKTerbesar;


    public double hitungRataIPK(double ipk1, double ipk2, double ipk3){
        return (ipk1 + ipk2 + ipk3)/3.0;
    }

    public double terbesar(double ipk1, double ipk2, double ipk3){
            if (ipk2 > ipk1 && ipk2 > ipk3) {
                iPKTerbesar = ipk2;
            } else if (ipk3 > ipk1 && ipk3 > ipk2) {
                iPKTerbesar = ipk3;
            } else {
                iPKTerbesar = ipk1;
            }
            return iPKTerbesar;
    }
}
