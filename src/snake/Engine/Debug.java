package snake.Engine;

import snake.Apple.Apple;
import snake.Settings.Difficulty;

import java.awt.*;
import java.io.File;

public class Debug {

    public static boolean net = false;
    public static boolean border = false;
    public static boolean f3 = false;

    public static void debugLine(Graphics g){
       if(net) {net(g);}
       if(border) {borderLine(g);}
       if(f3) {difficulty(g);}
    }
    public static void net(Graphics g){
        for (int i = 0; (WindowEngine.height / Engine.dotSize) > i; i++) {
            g.drawLine(i*Engine.dotSize, 0, i*Engine.dotSize, WindowEngine.height);
            g.drawLine(0, i*Engine.dotSize, WindowEngine.height, i*Engine.dotSize);
        }
    }

    public static void borderLine(Graphics g){
        g.setColor(Color.CYAN);
        //up
        g.drawLine(0, 0, WindowEngine.width - (Engine.dotSize), 0);
        //left
        g.drawLine(0, 0,0 , WindowEngine.height - (Engine.dotSize));
        //down
        g.drawLine(0, WindowEngine.height - (Engine.dotSize), WindowEngine.width - (Engine.dotSize), WindowEngine.height - (Engine.dotSize));
        //right
        g.drawLine(WindowEngine.width - (Engine.dotSize+1), 0, WindowEngine.width - (Engine.dotSize+1), WindowEngine.height - (Engine.dotSize));
    }
    public static void deathBorderLine(Graphics g){
        g.setColor(Color.RED);
        //up
        g.drawLine(0, 0, WindowEngine.width - (Engine.dotSize), 0);
        //left
        g.drawLine(0, 0,0 , WindowEngine.height - (Engine.dotSize));
        //down
        g.drawLine(0, WindowEngine.height - (Engine.dotSize), WindowEngine.width - (Engine.dotSize), WindowEngine.height - (Engine.dotSize));
        //right
        g.drawLine(WindowEngine.width - (Engine.dotSize+1), 0, WindowEngine.width - (Engine.dotSize+1), WindowEngine.height - (Engine.dotSize));
    }

    public static void difficulty(Graphics g){
        g.setColor(Color.white);
        g.drawString("DSpeed = " + Difficulty.DSpeed, 10, WindowEngine.height-20);
    }

    public static void resetMaxScore() {

        Apple.maxScore = 0;
        Config.Wright(Config.score, "0");

    }



    public static void Log(String text){
        System.out.println(text);
    }
}
