package snake.Engine;

import javax.swing.*;

public class WindowEngine extends JFrame  {

    private static final int size = 640;

    public static final int width = size;
    public static final int height = size;

    public WindowEngine(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(width + (Engine.dotSize/2), height + 25 + (Engine.dotSize/2));
        setLocation(500, 500);
        add(new Engine());
        setVisible(true);
        setResizable(true);
    }
}
