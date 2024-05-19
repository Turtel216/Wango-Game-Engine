package graphics.window;

import graphics.window.events.EventListener;

import javax.swing.*;
import java.awt.*;

// super class for all windows
public class Window extends JFrame {

    private final String title;
    private final int sizeX;
    private final int sizeY;
    private EventListener eventListener;

    //TODO replace with static factory for better handling of optional fields
    public Window(String title, int sizeX, int sizeY) {
        this.title = title;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void createWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(sizeX, sizeY);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }
}
