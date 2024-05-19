package entities;

import loader.assets.ResourchManager;

//Entity super class, containing all attributes shared by all Game Objects
public abstract class GameObject {
    private ResourchManager resourchManager;

    public abstract void render();
}
