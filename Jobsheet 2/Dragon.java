public class Dragon {
    
    int x, y;
    int width, height;

    void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    void moveUp() {
        if (y > 0) {
            y++;
        } else {
            detectCollision();
        }
    }

    void moveDown() {
        if (y < height) {
            y--;
        } else {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over!");
    }
}
