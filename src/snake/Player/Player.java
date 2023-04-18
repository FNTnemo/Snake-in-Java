package snake.Player;

import snake.Engine.Engine;
import snake.Engine.WindowEngine;

import java.awt.*;

public class Player {
    public static int[] x = new int[Engine.allDots];
    public static int[] y = new int[Engine.allDots];

    public static int quantitySnakeDots = 3;

    static boolean right = true;
    static boolean left;
    static boolean up;
    static boolean down;

    public static void renderPlayer(Graphics graphics){
        graphics.setColor(Color.GREEN);
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
    public static void checkCollisions(){
        for (int i = quantitySnakeDots; i > 0 ; i--) {
            if(i > 4 && x[0] == x[i] && y[0] == y[i]){
                Engine.run = false;
            }
        }
        if(x[0] > WindowEngine.width - (Engine.dotSize*2)){
            Engine.run = false;
        } else if (y[0] > WindowEngine.height - (Engine.dotSize*2)) {
            Engine.run = false;
        } else if(x[0] < 0){
            Engine.run = false;
        } else if (y[0] < 0) {
            Engine.run = false;
        }
    }
}

