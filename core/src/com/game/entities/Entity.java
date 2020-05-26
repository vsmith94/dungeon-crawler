/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.MapObject;

/**
 *
 * @author Vinicius Smith
 */
public class Entity extends MapObject {

    Sprite sprite;

    public Entity() {

    }

    public Entity(Sprite sprite) {
        this.sprite = sprite;
    }

    public Entity(Sprite sprite, float x, float y) {
        this.sprite = sprite;
        this.sprite.setPosition(x, y);
    }

    public Entity(Texture texture) {
        this.sprite = new Sprite(texture);
    }

    public Entity(Texture texture, float x, float y) {
        this.sprite = new Sprite(texture);
        this.sprite.setPosition(x, y);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public void setSprite(Texture texture) {
        this.sprite = new Sprite(texture);
    }
}
