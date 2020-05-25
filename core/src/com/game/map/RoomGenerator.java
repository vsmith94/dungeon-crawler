/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.math.MathUtils;

/**
 *
 * @author lpela
 */
public class RoomGenerator extends ApplicationAdapter {

    private Array<Room> rooms;

    @Override
    public void create() {
        rooms = new Array<>();
    }

    public void RandomRoomGeneration() {
        Room room = new Room(MathUtils.random(2, 0), MathUtils.random(2, 0));
        room.setX(MathUtils.random(0, 1920 - ((room.getWidth() + 2) * 32)));
        room.setY(MathUtils.random(0, 1080 - ((room.getHeight() + 3) * 32)));
        for (int a = 0; a < (room.getX() * room.getY())/10;a++) {
            room.addObject (MathUtils.random(room.getX(), room.getX()+(32*room.getWidth())), MathUtils.random(room.getY(), room.getY()+(32*room.getHeight())), MathUtils.random(1, 2));
        }
        rooms.add(room);
    }

}
