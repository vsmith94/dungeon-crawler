/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.entities.terrain;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.entities.Entity;
/**
 *
 * @author lpela
 */
public class Textures extends Entity {
    private int textureType;
    
    public static Texture floorTile = new Texture("floor33.gif");
    public static Texture wall = new Texture("wall12.gif");
    public static Texture wallTop = new Texture("roomWall33.gif");
    public static Texture plaster = new Texture("roomFloor22.gif");
}
