/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.utils.Array;
import com.game.entities.terrain.BottomWall;
import com.game.entities.terrain.CornerBottomLeft;
import com.game.entities.terrain.CornerBottomRight;
import com.game.entities.terrain.CornerTopRight;
import com.game.entities.terrain.CornerTopLeft;
import com.game.entities.terrain.Floor;
import com.game.entities.terrain.LeftWall;
import com.game.entities.terrain.RightWall;
import com.game.entities.terrain.Textures;
import com.game.entities.terrain.TopWall;

/**
 *
 * @author lpela
 */
public class Room {

    private float x;
    private float y;
    private float height;
    private float width;
    private Array<Object> objects;

    public Room(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public Room(float x, float y, float height, float width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void addObject(float x, float y, int type) {
        Object object = new Object(x, y, type);
        objects.add(object);
    }

    public void createRoom(MapLayer... layers) {
        MapLayer floors;
        MapLayer walls;
        floors = layers[0];
        walls = layers[0];
        //Floor
        for (int a = 0; a < width; a++) {
            for (int b = 0; b < height; b++) {
                Floor floor = new Floor(Textures.floorTile, x + (32 * a), y + (32 * b));
                floors.getObjects().add(floor);
            }
        }
        //Top Wall
        for (int a = 0; a < width; a++) {
            TopWall topWall = new TopWall(Textures.wall, x + (32 * a), y + (32 * height) + 1);
            walls.getObjects().add(topWall);
            topWall = new TopWall(Textures.wall, x + (32 * a), y + (32 * height) + 32);
            walls.getObjects().add(topWall);
            topWall = new TopWall(Textures.wallTop, x + (32 * a), y + (32 * height) + 64);
            walls.getObjects().add(topWall);
            topWall = new TopWall(Textures.plaster, x + (32 * a), y + (32 * height) + 80);
            walls.getObjects().add(topWall);
        }
        //Right Wall
        for (int b = 0; b < height; b++) {
            RightWall rightWall = new RightWall(Textures.wall, x + 1 + (32 * width), y + (32 * b));
            walls.getObjects().add(rightWall);
            rightWall = new RightWall(Textures.wallTop, x + 24 + (32 * width), y + (32 * b));
            walls.getObjects().add(rightWall);
            rightWall = new RightWall(Textures.plaster, x + 40 + (32 * width), y + (32 * b));
            walls.getObjects().add(rightWall);
        }
        //Left Wall
        for (int b = 0; b < height; b++) {
            LeftWall leftWall = new LeftWall(Textures.wallTop, x - 16, y + (32 * b));
            walls.getObjects().add(leftWall);
            leftWall = new LeftWall(Textures.plaster, x - 32, y + (32 * b));
            walls.getObjects().add(leftWall);
        }
        //Bottom Wall
        for (int a = 0; a < width; a++) {
            BottomWall bottomWall = new BottomWall(Textures.wallTop, x + (32 * a), y - 16);
            walls.getObjects().add(bottomWall);
            bottomWall = new BottomWall(Textures.plaster, x + (32 * a), y - 32);
            walls.getObjects().add(bottomWall);
        }
        //Top Right Corner
        CornerTopRight cornerTopRight = new CornerTopRight(Textures.wall, x + (32 * width), y + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.wall, x + (32 * width), y + 32 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.wallTop, x + 24 + (32 * width), y + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.wallTop, x + 24 + (32 * width), y + 32 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.wallTop, x + (32 * width), y + 64 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.wallTop, x + 24 + (32 * width), y + 64 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + 40 + (32 * width), y + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + 40 + (32 * width), y + 32 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + 40 + (32 * width), y + 64 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + 40 + (32 * width), y + 80 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + (32 * width), y + 80 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        cornerTopRight = new CornerTopRight(Textures.plaster, x + 32 + (32 * width), y + 80 + (32 * height));
        walls.getObjects().add(cornerTopRight);
        //Top Left Corner
        CornerTopLeft cornerTopLeft = new CornerTopLeft(Textures.wallTop, x - 16, y + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.wallTop, x - 16, y + 32 + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.plaster, x - 32, y + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.plaster, x - 32, y + 32 + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.plaster, x - 32, y + 64 + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.plaster, x, y + 80 + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        cornerTopLeft = new CornerTopLeft(Textures.plaster, x - 32, y + 80 + (32 * height));
        walls.getObjects().add(cornerTopLeft);
        //Bottom Right Corner
        CornerBottomRight cornerBottomRight = new CornerBottomRight(Textures.wallTop, x + (32 * width), y - 16);
        walls.getObjects().add(cornerBottomRight);
        cornerBottomRight = new CornerBottomRight(Textures.plaster, x + 40 + (32 * width), y - 32);
        walls.getObjects().add(cornerBottomRight);
        cornerBottomRight = new CornerBottomRight(Textures.plaster, x + 32 + (32 * width), y - 32);
        walls.getObjects().add(cornerBottomRight);
        cornerBottomRight = new CornerBottomRight(Textures.plaster, x + (32 * width), y - 32);
        walls.getObjects().add(cornerBottomRight);
        //Bottom Left Corner (Simple Plaster)
        CornerBottomLeft cornerBottomLeft = new CornerBottomLeft(Textures.plaster, x - 32, y - 32);
        walls.getObjects().add(cornerBottomLeft);
    }

}
