package graphics.window;

import configs.GameConfig;
import graphics.window.events.EventListener;

//TODO determine optional and non-optional fields
public class WindowBuilder {
    private GameConfig gameConfig;
    private EventListener eventListener;
    private String title;
    private int sizeX;
    private int sizeY;

    //Contains none optional objects
    public WindowBuilder(String title) {
        this.title = title;
    }

    //setters for optional fields
    public WindowBuilder setHasConfig(GameConfig config) {
        this.gameConfig = config;
        return this;
    }

    //Build method for Window object
    public Window build() {
        return new Window(this);
    }

    public GameConfig getGameConfig() {
        return gameConfig;
    }

    public void setGameConfig(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
    }

    public EventListener getEventListener() {
        return eventListener;
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}
