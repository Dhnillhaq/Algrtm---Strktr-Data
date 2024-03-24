public class HotelService {
    Hotel rooms[] = new Hotel[4];
    int index;

    public void tambah(Hotel h) {
            if (index < rooms.length) {
                rooms[index] = h;
                index++;
            } else {
                System.out.println("Data sudah penuh");
            }
        }

    public void tampil() {
        for (Hotel h : rooms) {
            h.tampil();
            System.out.println("-------------------");
        }
    }

    public void bsHarga() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j]= rooms[j - 1];
                    rooms[j-1] = temp;
                }
            }
        }
        tampil();
    }
    public void bsBintang() {
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j]= rooms[j - 1];
                    rooms[j-1] = temp;
                }
            }
        }
        tampil();
    }
    
    public void sSHarga() {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
        tampil();
    }
    public void sSBintang() {
        for (int i = 0; i < rooms.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
        tampil();
    }
}
