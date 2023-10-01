package snake.Engine;

import snake.Apple.Apple;
import snake.Apple.AppleSpawn;
import snake.Player.KeyListener;
import snake.Player.Player;
import snake.Player.PlayerPhysics;
import snake.Settings.Difficulty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine extends JPanel implements ActionListener {

    public static final int dotSize = 16;
    public static final int allDots = (WindowEngine.width / dotSize) * (WindowEngine.height / dotSize);
    public static boolean run = true;

    public static int gameSpeed = 180;

    public Engine(){
        setBackground(Color.BLACK);
        addKeyListener(new KeyListener());
        setFocusable(true);
        init();
    }
    public static Timer timer;
    private void init(){
        timer = new Timer(gameSpeed, this);
        timer.start();
        AppleSpawn.newApple();
        Config.checkDir(Config.mainDir);
        Debug.Log("game started");
    }
    public static void GameTimerReload(){
        timer.restart();
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
            if(Player.win())
                System.out.println("1");
            Player.move(1);
            PlayerPhysics.checkCollisions();
            Apple.checkCollisions();
            Difficulty.Difficulty();
        }
        repaint();
    }

    public static void restartGame(){
        Player.defaultPlayerSettings();
        run = true;
        Debug.Log("restartGame");
    }




}
