package ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;
    public double sMiringRaw ;
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
     
    public double cariSiming(){
        return alas * alas + tinggi * tinggi;
    }

    public double simingDua(){
        return sMiringRaw = Math.sqrt(cariSiming());
    }

    public int hitungLuas(){
        return   alas * tinggi / 2;
    }

    public int keliling(){
        int sMiringBulat = (int) simingDua();
        return alas + tinggi + sMiringBulat;
    }
}
