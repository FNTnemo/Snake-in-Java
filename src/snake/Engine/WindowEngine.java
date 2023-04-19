package snake.Engine;

import javax.swing.*;

public class WindowEngine extends JFrame  {

    public static final int size = 320;

    public static final int width = size;
    public static final int height = size;

    public WindowEngine(){
        setTitle("Snake-in-Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(width, height + 25);
        setLocation(100, 100);
        add(new Engine());
        setVisible(true);
        setResizable(true);
    }
}
