package BangunRuang;

public class LimasSegi4 {
    public int sisiAlas;
    public int tinggi;

    public LimasSegi4(){
        
    }

    public double hitungLPLimas(int s, int t){
        sisiAlas = s;
        tinggi = t;
        return s * s + 4 * s * Math.sqrt(s/2.0 * s/2.0 + t * t)/2.0;
    }
    public double hitungVolumeLimas(int s, int t){
        sisiAlas = s;
        tinggi = t;
        return 1/3.0 * s * s * t; 
    }

}
