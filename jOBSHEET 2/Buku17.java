public class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga, htotal, diskon, jumlah, hbayar;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok :" + stok);
        System.out.println("Harga :" + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            jumlah = jml;
            stok -= jml;
            System.out.println(jumlah);
        } else {
            System.out.println("Gabisa");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        htotal = harga * jumlah;
        System.out.println("Harga total-nya adalah: Rp."+htotal);
        return htotal;
    }

    int hitungDiskon() {
        if (htotal > 150000) {
            diskon = htotal * 12 / 100;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar: Rp."+diskon);
        } else if (htotal > 75000 && htotal <= 150000) {
            diskon = htotal * 5 / 100;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar: Rp."+diskon);
        } else {
            diskon = htotal * 1;
            System.out.println("SELAMAT! anda mendapatkan diskon sebesar: Rp."+diskon);
        }
        return diskon;
    }

    int hitungHargaBayar() {
        hbayar = htotal - diskon;
        System.out.println("Harga yang harus anda bayar adalah: Rp." +hbayar);
        return hbayar;
    }

    public Buku17() {

    }

    public Buku17(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}