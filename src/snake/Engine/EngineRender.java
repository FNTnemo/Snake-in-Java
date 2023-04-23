package snake.Engine;

import snake.Apple.Apple;
import snake.Player.Player;

import java.awt.*;

public class EngineRender {
    public static void render(Graphics graphics){
        Debug.debugLine(graphics);

        score(graphics);
        maxScore(graphics);

        Player.renderPlayer(graphics);
        Apple.appleRenderer(graphics, Apple.appleColor);

    }

    private static void score(Graphics g){
        g.setColor(Color.pink);
        g.drawString("Score: " + Apple.numOfApples, WindowEngine.width/3 - 30, 25 + 5);
    }

    public static void maxScore(Graphics g){
        g.setColor(Color.pink);
        g.drawString("Max score: " + Apple.maxScore, WindowEngine.width/2, 25 + 5);
    }

    public static void deathMenu(Graphics g){
        score(g);
        maxScore(g);
        g.setColor(Color.pink);
        g.drawString(" Press SPACE button to start.",WindowEngine.width/2-85, WindowEngine.height/2);
    }
}
