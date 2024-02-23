public class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga, htotal, jumlah;

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: " +pengarang);
        System.out.println("Jumlah Halaman: "+ halaman);
        System.out.println("Sisa Stok :"+stok);
        System.out.println("Harga :"+harga);
    }
    void terjual(int jml){
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Gabisa");
        }
    }
    void restock(int jml){
        jumlah = jml;
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(){
        htotal = harga * jumlah;
        System.out.println(htotal);
    }

    void hitungDiskon(){
        
    }
    void hitungHargaBayar(){

    }
    
    public Buku17(){
        
    }

    public Buku17(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}