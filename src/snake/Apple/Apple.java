package snake.Apple;

import snake.Engine.Engine;
import snake.Player.Player;

import java.awt.*;
import java.util.Random;

public class Apple {

    static Random random = new Random();

    public static int appleX;
    public static int appleY;

    public static int numOfApples;
    public static void createApple(){
        appleX = (random.nextInt(0, 9)*Engine.dotSize);
        appleY = (random.nextInt(0, 9)*Engine.dotSize);

        numOfApples += 1;
    }

    public static void checkCollisions(){
        if(Player.x[0] == appleX && Player.y[0] == appleY){
            Player.quantitySnakeDots++;
            createApple();
        }
    }

    public static void appleRenderer(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillOval(appleX, appleY, Engine.dotSize, Engine.dotSize);
    }
}
