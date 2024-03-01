package ArraySegitiga;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] stArray = new Segitiga[4];

        stArray[0] = new Segitiga(10, 4); 
        stArray[1] = new Segitiga(20, 10); 
        stArray[2] = new Segitiga(15, 6); 
        stArray[3] = new Segitiga(25, 10); 

        for (int i = 0; i < stArray.length; i++) {
            System.out.println("Luas Segitiga: " + i + " adalah     : "+ stArray[i].hitungLuas());
            System.out.println("Keliling Segitiga: " + i + " adalah : "+ stArray[i].keliling());
        }
        
    }
}
