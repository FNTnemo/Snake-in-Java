package snake.Apple;

import snake.Engine.Config;
import snake.Engine.Engine;
import snake.Engine.WindowEngine;
import snake.Player.Player;

import java.awt.*;
import java.util.Random;

public class Apple {

    static Random random = new Random();

    public static int appleX;
    public static int appleY;

    public static int randomCoord = WindowEngine.size / Engine.dotSize - 1;

    public static int numOfApples;
    public static int maxScore = Config.Right(Config.score);
    public static void createApple(){
        appleX = (random.nextInt(0, randomCoord)*Engine.dotSize);
        appleY = (random.nextInt(0, randomCoord)*Engine.dotSize);
    }

    public static void checkCollisions(){
        if(Player.x[0] == appleX && Player.y[0] == appleY){
            Player.quantitySnakeDots++;
            numOfApples++;
            if(numOfApples > maxScore){
                maxScore++;
                Config.Wright(Config.score, maxScore);
            }

            createApple();
        }
        for (int i = Player.quantitySnakeDots; i > 0 ; i--) {
            if(Player.x[i] == appleX && Player.y[i] == appleY){
                createApple();
            }
        }
    }

    public static void appleRenderer(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillOval(appleX+1, appleY+1, Engine.dotSize-2, Engine.dotSize-2);
    }
}
