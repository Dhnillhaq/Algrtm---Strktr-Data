public class DragonMain {
    public static void main(String[] args) {
        Dragon start = new Dragon();
        start.x = 3;
        start.y = 2;
        start.width = 6;
        start.height = 6;

        start.moveDown();
        start.moveDown();
        start.moveRight();
        start.moveRight();
        start.moveRight();
        start.moveRight();

    


        start.printPosition();

    }
    


}
