package BangunRuang;

public class Bola {
    public int jari2;
    public Bola(){
        
    }

    public double hitungLPBola(int r){
        return 4 * 22/7.0 * r * r;
    }
    public double hitungVolumeBola(int r){
        return 4/3.0 * 22/7.0 * r * r * r; 
    }
}
