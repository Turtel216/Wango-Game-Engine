package entities;

import loader.assets.ResourchManager;

import java.util.Optional;

//Entity super class, containing all attributes shared by all Game Objects
public abstract class GameObject {
    private ResourchManager resourchManager;
    private String config; //config to be used with Optional method getConfig()

    // Render method for all GameObject
    public abstract void render();
    // Optional method to be used if a config is provided to initialize the GameObject
    public abstract Optional<String> getConfig();
}
