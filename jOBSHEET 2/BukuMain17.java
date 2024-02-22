public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 buk1 = new Buku17();
        buk1.judul = "Today Ends Tomorrow Comes";
        buk1.pengarang = "Denanda Pratiwi";
        buk1.halaman = 198;
        buk1.stok = 13;
        buk1.harga = 71000;

        Buku17 buk2 = new Buku17("Self Reward", "Maheera Ayesha", 160, 29, 59000);

        buk1.tampilInformasi();
        buk1.terjual(5);
        buk1.gantiHarga(60000);
        buk1.tampilInformasi();

        buk2.tampilInformasi();
        buk2.terjual(11);
        buk2.tampilInformasi();

        Buku17 bukuDhanil = new Buku17("Tentang Dhanil", "Muhammad Dhia Ramadhanil Haq", 99, 1, 789000);
        bukuDhanil.tampilInformasi();
    }
}
