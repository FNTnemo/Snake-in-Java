package snake.Player;

import snake.Apple.Apple;
import snake.Engine.Engine;
import snake.Engine.WindowEngine;

import java.awt.*;

public class Player {
    public static int[] x = new int[Engine.allDots];
    public static int[] y = new int[Engine.allDots];

    public static int quantitySnakeDots;

    static boolean right;
    static boolean left;
    static boolean up;
    static boolean down;

    public static void defaultPlayerSettings(){
        Apple.numOfApples = 0;
        quantitySnakeDots = 2;
        x[0] = 0;
        y[0] = 0;
        right = true;
    }

    public static void renderPlayer(Graphics graphics){
        for (int i = 0; i < quantitySnakeDots; i++) {
            graphics.setColor(new Color(45, 180, 0));
            if(i==0){ graphics.setColor(Color.green); }
            graphics.fillRect(x[i], y[i], Engine.dotSize, Engine.dotSize);
        }
    }
    public static void move(int speed){
        for (int i = quantitySnakeDots; i > 0 ; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if(right){
            x[0] += speed * Engine.dotSize;
        } else if (left) {
            x[0] -= speed * Engine.dotSize;
        } else if (up) {
            y[0] -= speed * Engine.dotSize;
        } else if (down) {
            y[0] += speed * Engine.dotSize;
        } else {Engine.run = false;}

    }

    public static boolean win(){
        if(quantitySnakeDots >= (WindowEngine.width / Engine.dotSize) * (WindowEngine.height / Engine.dotSize)){
            return true;
        } else {return false;}
    }

}

