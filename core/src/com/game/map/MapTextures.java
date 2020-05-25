/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/**
 *
 * @author lpela
 */
public class MapTextures extends ApplicationAdapter {
    static private SpriteBatch batch;
    static private Texture floor, wall, wallTop, plaster;
    private int textureType;
/*
    switch (textureType) {
        case 1:
            @Override
            public void create() {
                batch = new SpriteBatch();
                floor = new Texture("floor33.gif");
                wall = new Texture("wall12.gif");
                wallTop = new Texture("roomWall33.gif");
                plaster = new Texture("roomFloor22.gif");
            }
            break;
    }*/
    
}
