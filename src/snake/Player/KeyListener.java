package snake.Player;

import snake.Engine.Debug;
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

        if (key == KeyEvent.VK_SPACE && !Engine.run){
            Engine.restartGame();
        }

        if (key == KeyEvent.VK_E && !Debug.net) {
            Debug.net = true;
        } else if (key == KeyEvent.VK_E && Debug.net) {
            Debug.net = false;
        }

        if (key == KeyEvent.VK_B && !Debug.border) {
            Debug.border = true;
        } else if (key == KeyEvent.VK_B && Debug.border) {
            Debug.border = false;
        }

        if(key == KeyEvent.VK_F3 && !Debug.f3){
            Debug.net = true;
            Debug.border = true;
            Debug.f3 = true;
        } else if (key == KeyEvent.VK_F3) {
            Debug.net = false;
            Debug.border = false;
            Debug.f3 = false;
        }

        if(key == KeyEvent.VK_R){
            Debug.resetMaxScore();
        }
    }
}
