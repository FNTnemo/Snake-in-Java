package snake.Engine;

import snake.Apple.Apple;
import snake.Player.KeyListener;
import snake.Player.Player;
import snake.Player.PlayerPhysics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine extends JPanel implements ActionListener {

    public static final int dotSize = 16;
    public static final int allDots = (WindowEngine.width / dotSize) * (WindowEngine.height / dotSize);
    public static boolean run = true;

    private static final int gameSpeed = 180;

    public Engine(){
        setBackground(Color.BLACK);
        addKeyListener(new KeyListener());
        setFocusable(true);
        init();
    }

    private void init(){
        Timer timer = new Timer(gameSpeed, this);
        timer.start();
        Apple.createApple();
        Config.checkDir(Config.mainDir);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(run){EngineRender.render(g);}
        else {EngineRender.deathMenu(g);}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(run){
            Player.move(1);
            PlayerPhysics.checkCollisions();
            Apple.checkCollisions();
        }
        repaint();
    }

    public static void restartGame(){
        Player.defaultPlayerSettings();
        run = true;
    }




}
