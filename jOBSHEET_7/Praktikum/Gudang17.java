 public class Gudang17 {
    Barang17[] tumpukan;
    int size;
    int top;

    public Gudang17(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang17[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang17 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.kode + " ditambahkan");
        } else {
            System.out.println("Gagal! Gudang penuh");
        }
    }

    public Barang17 ambilBarang17() {
        if (!cekKosong()) {
            Barang17 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan Barang kosong");
            return null;
        }
    }

    public Barang17 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang17 barangTeratas =tumpukan[top];
            System.out.println("Barang Teratas: " + barangTeratas.kode + " : " + barangTeratas.nama + " (Kategori " + barangTeratas.kategori+")");
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        // if (!cekKosong()) {
            System.out.println("Rincian Tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s) \n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        // } else {
            System.out.println("Tumpukan Barang Kosong");
        // }
    }
}
