public class PencarianBuku17 {
    public Buku17[] listBk = new Buku17[5];
    public int idx;

    void tambah(Buku17 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku17 m : listBk) {
            m.tampilData();
            System.out.println("-------------------");
        }
    }
    // Method Sequential Search Integer
    // public int findSeqSearch(int cari){
    // int posisi = -1;
    // for (int j = 0; j < listBk.length; j++) {
    // if (listBk[j].kodeBuku == cari) {
    // posisi = j;
    // break;
    // }
    // }
    // return posisi;
    // }

    // Method Sequential Search String Kode Buku && Judul Buku
    public int findSeqSearch(String cari) {
        int posisi = -1;
        int booksFound = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari) || listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                booksFound++;
            }
        }
        if (booksFound > 1) {
            return -2;
        } else {
            return posisi;
        }
    }

    // Sorting Pengurutan Descending Sebelum diSearch
    public void sortingAsc(int cariApa) {
        switch (cariApa) {
            case 1:
                for (int i = 0; i < listBk.length - 1; i++) {
                    for (int j = i + 1; j < listBk.length; j++) {
                        if (listBk[i].kodeBuku.compareTo(listBk[j].kodeBuku) > 0) {
                            Buku17 temp = listBk[i];
                            listBk[i] = listBk[j];
                            listBk[j] = temp;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listBk.length - 1; i++) {
                    for (int j = i + 1; j < listBk.length; j++) {
                        if (listBk[i].judulBuku.compareTo(listBk[j].judulBuku) > 0) {
                            Buku17 temp = listBk[i];
                            listBk[i] = listBk[j];
                            listBk[j] = temp;
                        }
                    }
                }
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
                break;
        }
    }
    // Method Binary Search bertipe data Integer
    // public int findBinarySearch(int cari, int left, int right){
    // if (left <= right) {
    // int mid = (left + right)/2;
    // if (cari == listBk[mid].kodeBuku) {
    // return (mid);
    // } else if (cari > listBk[mid].kodeBuku) {
    // return findBinarySearch(cari, left, mid-1);
    // } else {
    // return findBinarySearch(cari, mid+1, right);
    // }
    // }
    // return -1;
    // }

    // Method Binary Search bertipe data String Judul Buku
    public int findBinarySearchKB(String cari, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return findBinarySearchKB(cari, left, mid - 1);
            } else {
                return findBinarySearchKB(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // Method Binary Search bertipe data String Judul Buku
    public int findBinarySearchJudul(String cari, int left, int right) {
        int mid;
        int booksFound = 0;
        if (left <= right) {
            mid = (left + right) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                booksFound++;
                if (mid >= 0 && mid < listBk.length - 1) {
                    if (listBk[mid].judulBuku.equals(listBk[mid + 1].judulBuku)) {
                        booksFound++;
                    }
                } else if (mid > 0 && mid <= listBk.length - 1) {
                    if (listBk[mid].judulBuku.equals(listBk[mid - 1].judulBuku)) {
                        booksFound++;
                    }
                }
            } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                System.out.println("Kekiri");
                return findBinarySearchJudul(cari, left, mid - 1);
            } else {
                System.out.println("Keknan");
                return findBinarySearchJudul(cari, mid + 1, right);
            }
        }
        if (booksFound > 1) {
            return -2;
        } else if (booksFound == 1) {
            if (left <= right) {
                mid = (left + right) / 2;
                if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                    return mid;
                } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                    return findBinarySearchJudul(cari, left, mid - 1);
                } else {
                    return findBinarySearchJudul(cari, mid + 1, right);
                }
            }
        } else {
            return -1;
        }
        return -1;
    }

    public Buku17 FindBuku(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari || listBk[j].judulBuku == cari) {
                posisi = j;
                break;
            }
        }
        return listBk[posisi];
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1 && pos != -2) {
            System.out.println("data : " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1 && pos != -2) {
            System.out.println("Kode Buku\t : " + listBk[pos].kodeBuku);
            System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stok\t\t : " + listBk[pos].stok);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

}