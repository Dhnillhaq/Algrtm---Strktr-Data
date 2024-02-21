public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 buk1 = new Buku17();
        buk1.judul = "Dongeng";
        buk1.halaman = 63;
        buk1.harga = 15;
        buk1.pengarang = "Bapak saipudinn";
        buk1.stok = 3;

        buk1.tampilInformasi();
        buk1.terjual(4);

    }
}
