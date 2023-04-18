package snake.Player;

import snake.Engine.Engine;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent event){

        super.keyPressed(event);
        int key = event.getKeyCode();

        if(key == KeyEvent.VK_W && !Player.down){
            Player.up = true;
            Player.left = false;
            Player.right = false;
        } else if (key == KeyEvent.VK_S && !Player.up) {
            Player.down = true;
            Player.left = false;
            Player.right = false;
        } else if (key == KeyEvent.VK_A && !Player.right) {
            Player.up = false;
            Player.down = false;
            Player.left = true;
        } else if (key == KeyEvent.VK_D && !Player.left) {
            Player.up = false;
            Player.down = false;
            Player.right = true;
        }

        else if (key == KeyEvent.VK_ESCAPE ){
            Engine.run = false;
        }

        else if (key == KeyEvent.VK_R && !Engine.net) {
            Engine.net = true;
        } else if (key == KeyEvent.VK_R && Engine.net) {
            Engine.net = false;
        }
    }
}
