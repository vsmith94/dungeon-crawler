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
public class LeftWall extends Entity {

    public LeftWall(Sprite sprite, float x, float y) {
        super(sprite, x, y);
    }

    public LeftWall(Texture texture, float x, float y) {
        super(texture, x, y);
    }
}
