import java.util.Scanner;

public class DragonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek dragon
        Dragon dragon = new Dragon();
        
        // Mengatur lebar dan tinggi area permainan
        dragon.width = 10;
        dragon.height = 10;
        
        // Memindahkan dragon ke posisi awal
        dragon.x = 5;
        dragon.y = 5;
        
        // Memanggil method untuk mencetak posisi awal dragon
        dragon.printPosition();
        
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("Pilih aksi:");
            System.out.println("1. Move Left");
            System.out.println("2. Move Right");
            System.out.println("3. Move Up");
            System.out.println("4. Move Down");
            System.out.println("0. Keluar");

            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    dragon.moveLeft();
                    break;
                
                case 2 :
                    dragon.moveRight();
                    break;

                case 3 :
                    dragon.moveUp();
                    break;

                case 4 :
                    dragon.moveDown();
                    break;

                case 0 :
                    gameOver = true;
                    System.out.println("Game Over");
                    break;

                default:
                    break;
            }

            if (dragon.x < 0 || dragon.x >= dragon.width || dragon.y < 0 || dragon.y >= dragon.height) {
                dragon.detectCollision();
                gameOver = true;
            } else {
                // Memanggil method untuk mencetak posisi dragon setelah bergerak
                dragon.printPosition();
            }
        }

        sc.close();
    }
}

