package snake.Settings;

import java.awt.Graphics;
import snake.Engine.Engine;

public class Difficulty {
    public static boolean DSpeed = false;

    public static boolean DBorder = false;

    public static int DSpeedX = 50, DSpeedY = 270;

    public static int DBorderX = 170, DBorderY = 270;

    public static void difficultyRender(Graphics g) {
        g.drawString("Speed", DSpeedX, DSpeedY);
        g.drawString("1.", DSpeedX - 15, DSpeedY);
        if (!DSpeed)
            g.drawLine(DSpeedX - 1, DSpeedY - 5, DSpeedX + 37, DSpeedY - 5);
        g.drawString("Border", DBorderX, DBorderY);
        g.drawString("2.", DBorderX - 15, DBorderY);
        if (!DBorder)
            g.drawLine(DBorderX - 1, DBorderY - 5, DBorderX + 37, DBorderY - 5);
    }

    public static void Difficulty() {
        if (DSpeed) {
            DSpeed();
        } else {
            Engine.timer.setDelay(Engine.gameSpeed);
        }
        if (DBorder);
    }

    public static void DSpeed() {
        Engine.timer.setDelay(90);
    }
}

