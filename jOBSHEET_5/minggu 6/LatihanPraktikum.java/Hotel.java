public class Hotel {
    public String nama;
    public String kota;
    public int harga;
    public byte bintang;

    public Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public void tampil(){
        System.out.println("Nama\t: " + nama);
        System.out.println("Kota\t: " + kota);
        System.out.println("Harga\t: " + harga);
        System.out.println("Bintang\t: " + bintang);
    }

}
