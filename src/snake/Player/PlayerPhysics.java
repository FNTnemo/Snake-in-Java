package snake.Player;

import snake.Engine.Engine;
import snake.Engine.WindowEngine;
import snake.Settings.Difficulty;

public class PlayerPhysics extends Player {
    public static void checkCollisions(){
        for (int i = quantitySnakeDots; i > 0 ; i--) {
            if (i > 3 && x[0] == x[i] && y[0] == y[i]) {
                Engine.run = false;
                break;
            }
        }
        if(x[0] > WindowEngine.width - (Engine.dotSize*2)){
            if(!Difficulty.DBorder)
                x[0] = 0;
            else
                Engine.run = false;
            //Engine.run = false;
        } else if (y[0] > WindowEngine.height - (Engine.dotSize*2)) {
            if(!Difficulty.DBorder)
                y[0] = 0;
            else
                Engine.run = false;
            //Engine.run = false;
        } else if(x[0] < 0){
            if(!Difficulty.DBorder)
                x[0] = WindowEngine.width - (Engine.dotSize*2);
            else
                Engine.run = false;
            //Engine.run = false;
        } else if (y[0] < 0) {
            if(!Difficulty.DBorder)
                y[0] = WindowEngine.height - (Engine.dotSize*2);
            else
                Engine.run = false;
            //Engine.run = false;
        }
    }
}
