public class Dragon {
    int x, y, width, height;

    void moveUp(){
        if (y > 0 && y < height) {
            y = y + 1;
        } else {
            detectCollision();
        }
    }
    void moveDown(){
        if (y > 0 && y < height) {
            y = y -1;
        } else {
            detectCollision();
        }
    }
    void moveRight(){
        if (x > 0 && x < width) {
            x = x +1;
        } else {
            detectCollision();
        }
    }
    void moveLeft(){
        if (x > 0 && x < width) {
            x = x - 1;
        } else {
            detectCollision();
        }
    }

    void printPosition(){
        System.out.println("anda berada di koordinat :("+x + ","+y+")");
    }

    void detectCollision(){
        System.out.println("GAME OVER!");
        System.out.println("YOU LOSE");
        
    }
    
}
