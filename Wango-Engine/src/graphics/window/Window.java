package graphics.window;

import graphics.window.components.ScrollBar;
import graphics.window.components.ScrollPane;
import graphics.window.events.EventListener;

import javax.swing.*;
import java.awt.*;

//TODO determine optional and non-optional fields

// super class for all windows
public class Window extends JFrame {

    private final String title;
    private final int sizeX;
    private final int sizeY;
    private EventListener eventListener;

    //TODO replace with static factory for better handling of optional fields
    public Window(WindowBuilder windowBuilder) {
        this.title = windowBuilder.getTitle();
        this.sizeX = windowBuilder.getSizeX();
        this.sizeY = windowBuilder.getSizeY();
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public EventListener getEventListener() {
        return eventListener;
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    // TODO replace Build() methods according to build design pattern
    public void createWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(sizeX, sizeY);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }

    //Overloaded methods to add components to JFrame
    public void addComponent(JButton button) {
        this.add(button);
    }

    public void addComponent(JLabel text) {
        this.add(text);
    }

    public void addComponent(JCheckBox checkBox) {
        this.add(checkBox);
    }

    public void addComponent(JScrollPane scrollPane) {
        this.add(scrollPane);
    }

    public void addComponent(JTextField textField) {
        this.add(textField);
    }

    public void addComponent(JScrollBar scrollBar) {
        this.add(scrollBar);
    }

}
