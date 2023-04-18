package snake.Engine;

import snake.Apple.Apple;
import snake.Player.KeyListener;
import snake.Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Engine extends JPanel implements ActionListener {

    public static final int dotSize = 32;
    public static final int allDots = (WindowEngine.width / dotSize) * (WindowEngine.height / dotSize);
    public static boolean run = true;
    public static boolean net = false;
    public static final int gameSpeed = 230;

    public Engine(){
        setBackground(Color.BLACK);
        addKeyListener(new KeyListener());
        setFocusable(true);
        init();
    }

    public void init(){
        Timer timer = new Timer(gameSpeed, this);
        timer.start();
        Apple.createApple();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(run){
            render(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(run){
            Player.move(1);
            Player.checkCollisions();
            Apple.checkCollisions();
        } else {}
        repaint();
    }

    public void render(Graphics graphics){
        if(net) {net(graphics);}
        Player.renderPlayer(graphics);
        Apple.appleRenderer(graphics);
    }

    public void net(Graphics graphics){
        for (int i = 0; (WindowEngine.height / dotSize) > i; i++) {
            graphics.drawLine(i*dotSize, 0, i*dotSize, WindowEngine.height);
            graphics.drawLine(0, i*dotSize, WindowEngine.height, i*dotSize);
        }
    }

}
