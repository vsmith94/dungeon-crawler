/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/**
 *
 * @author lpela
 */
public class Object {
    private float x;
    private float y;
    private int type;

    public Object(float x, float y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getType() {
        return type;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setType(int type) {
        this.type = type;
    }
}
