package snake.Apple;

import snake.Engine.Engine;
import snake.Engine.WindowEngine;

import java.awt.*;

public class AppleSpawn extends Apple{

    public static int randomCoord = WindowEngine.size / Engine.dotSize - 1;

    public static void setRandomAppleCords(){
        appleX = (random.nextInt(0, randomCoord)*Engine.dotSize);
        appleY = (random.nextInt(0, randomCoord)*Engine.dotSize);
    }

    public static void newApple(){
        if(random.nextInt(0, 9) == 0){
            scoreAdd = 3;
            appleColor = Color.yellow;
            setRandomAppleCords();
        } else {
            scoreAdd = 1;
            appleColor = Color.red;
            setRandomAppleCords();
        }
    }
}
