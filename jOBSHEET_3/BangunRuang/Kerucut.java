package BangunRuang;

public class Kerucut {

    public int jari2;
    public int sMiring;


    public Kerucut(){

    }

    public double hitungLPKerucut(int r, int sMiring){
        return 22/7.0 * r * r + 22/7.0 * r * sMiring;
    }
    public double hitungVolumeKerucut(int r, int sMiring){
        return 1/3.0 * 22/7.0 * r * r * Math.sqrt(sMiring * sMiring - r * r); 
    }
}
