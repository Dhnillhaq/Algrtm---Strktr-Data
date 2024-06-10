
public class Mahasiswa {
    String nim, nama, noTelp;
    public Mahasiswa(){
        
    }
    public Mahasiswa(String nim, String nama, String noTelp){
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", noTelp=" + noTelp + '}';
    }
}