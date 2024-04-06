public class Buku17 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stok;

    public Buku17(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stok) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampilData() {
        System.out.println("========================================");
        System.out.println("Kode Buku\t : " + kodeBuku);
        System.out.println("Judul Buku\t : " + judulBuku);
        System.out.println("Tahun Terbit\t : " + tahunTerbit);
        System.out.println("Pengarang\t : " + pengarang);
        System.out.println("Stok\t\t : " + stok);
    
    }
}