public class Nasabah {
    String norek;
    String nama;
    String Alamat;
    int umur;
    double saldo;

    public Nasabah() {
        
    }

    public Nasabah(String no, String nm, String Alamat, int umur, double sdo) {
        this.norek = no;
        this.nama = nm;
        this.Alamat = Alamat;
        this.umur = umur;
        this.saldo = sdo;
    }
}