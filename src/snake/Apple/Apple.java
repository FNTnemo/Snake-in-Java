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


    public static int numOfApples;
    public static int maxScore = Config.Right(Config.score);

    public static int scoreAdd;
    public static Color appleColor;

    public static void checkCollisions(){
        if(Player.x[0] == appleX && Player.y[0] == appleY){
            Player.quantitySnakeDots++;
            numOfApples += scoreAdd;
            if(numOfApples > maxScore){
                maxScore += scoreAdd;
                Config.Wright(Config.score, maxScore);
            }
            AppleSpawn.newApple();
        }
        for (int i = Player.quantitySnakeDots; i > 0 ; i--) {
            if(Player.x[i] == appleX && Player.y[i] == appleY){
                AppleSpawn.setRandomAppleCords();
            }
        }
    }

    public static void appleRenderer(Graphics graphics, Color color){
        graphics.setColor(color);
        graphics.fillOval(appleX+1, appleY+1, Engine.dotSize-2, Engine.dotSize-2);
    }
}
