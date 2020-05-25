/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.Array;

/**
 *
 * @author lpela
 */
public class Room extends ApplicationAdapter {

    private int x;
    private int y;
    private int height;
    private int width;
    private Array<Object> objects;

    @Override
    public void create() {
        objects = new Array<>();
    }

    public Room(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Room(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void addObject(int x, int y, int type) {
        Object object = new Object(x, y, type);
        objects.add(object);
    }

    public void drawRoom() {
        for (int a = 0; a < width; a++) {
            for (int b = 1; b < height; b++) {
                Walls.drawFloor(x + (32 * a), y + (32 * b));
            }
        }

        for (int a = 0; a < width; a++) {
            Walls.bottomWall(1, 1);
        }
    }

}
