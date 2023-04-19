package snake.Player;

import snake.Engine.Engine;
import snake.Engine.WindowEngine;

public class PlayerPhysics extends Player {
    public static void checkCollisions(){
        for (int i = quantitySnakeDots; i > 0 ; i--) {
            if (i > 3 && x[0] == x[i] && y[0] == y[i]) {
                Engine.run = false;
                break;
            }
        }
        if(x[0] > WindowEngine.width - (Engine.dotSize*2)){
            x[0] = 0;
            //Engine.run = false;
        } else if (y[0] > WindowEngine.height - (Engine.dotSize*2)) {
            y[0] = 0;
            //Engine.run = false;
        } else if(x[0] < 0){
            x[0] = WindowEngine.width - (Engine.dotSize*2);
            //Engine.run = false;
        } else if (y[0] < 0) {
            y[0] = WindowEngine.height - (Engine.dotSize*2);
            //Engine.run = false;
        }
    }
}
