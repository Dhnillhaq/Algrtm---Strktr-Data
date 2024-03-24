public class Cars {
    public String merk;
    public String tipe;
    public int tahun;
    public int topSpeed;
    public int topPower;
    
    public Cars(String merk, String tipe, int tahun, int topSpeed, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topSpeed = topSpeed;
        this.topPower = topPower;
    }

    // method menampilkan Mobil yang paling kencang
    public void tampil(String massage, Cars Arr[], int index) {
        System.out.println(massage + Arr[index].merk + "\ntipe\t\t: " + Arr[index].tipe + "\ntahun\t\t: " + Arr[index].tahun + "\ntopSpeed\t: "
                + Arr[index].topSpeed + "\ntop power\t: " + Arr[index].topPower);
    }

    // method menghitung kecepatan tertinggi
    public int highestSpeed(Cars Arr[], int left, int right) {
        if (left == right) {
            return left;
        } else if (left == right - 1) {
            if (Arr[left].topSpeed > Arr[right].topSpeed) {
                return left;
            } else {
                return right;
            }
        } else {
            int mid = (left + right) / 2;
            int lsum = highestSpeed(Arr, left, mid);
            int rsum = highestSpeed(Arr, mid + 1, right);
            if (Arr[lsum].topSpeed > Arr[rsum].topSpeed) {
                return lsum;
            } else {
                return rsum;
            }
        }
    }
    // method menghitung kecepatan terendah
    public int lowestSpeed(Cars Arr[], int l, int r) {
        if (l == r) {
            return l;
        } else if (l == r - 1) {
            if (Arr[r].topSpeed > Arr[l].topSpeed) {
                return l;
            } else {
                return r;
            }
        } else {
            int mid = (l + r) / 2;
            int lsum = lowestSpeed(Arr, l, mid);
            int rsum = lowestSpeed(Arr, mid + 1, r);
            if (Arr[lsum].topSpeed < Arr[rsum].topSpeed) {
                return lsum;
            } else {
                return rsum;
            }
        }
    }

    // method menghitung rata rata topPower mobil
    public int topPower(Cars Arr[]) {
        int sumTopPower = 0;
        for (int i = 0; i < Arr.length; i++) {
            sumTopPower += Arr[i].topPower;
        }
        return sumTopPower / Arr.length;
    }

}
