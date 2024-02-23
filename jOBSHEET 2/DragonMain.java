public class DragonMain {
    public static void main(String[] args) {
        Dragon start = new Dragon();
        start.x = 0;
        start.y = 0;
        start.width = 6;
        start.height = 6;

        start.moveDown();
        start.printPosition();
        start.moveUp();
        start.printPosition();
        start.moveUp();
        start.printPosition();
        start.moveUp();
       
    }
}
