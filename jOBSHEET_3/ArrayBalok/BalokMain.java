package ArrayBalok;

public class BalokMain {
    public static void main(String[] args) {
        Balok[] bArray = new Balok[3];

        bArray[0] = new Balok(100, 30, 12);
        bArray[1] = new Balok(120, 40, 15);
        bArray[2] = new Balok(210, 50, 25);

        for (int i = 0; i < bArray.length; i++) {
            System.out.println("Volume balok ke - " +(i+1)+", adalah: " +bArray[i].volume());
        }
    }
}