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
public class Object extends ApplicationAdapter{
    private int x;
    private int y;
    private int type;

    public Object(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getType() {
        return type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setType(int type) {
        this.type = type;
    }
    /*
    switch (type) {
        case 1: {
           private Texture boulder;
           @Override
           public void create() {
                boulder = new Texture("boulder.gif");
           }
        }
    }*/
}
