/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.util;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.math.Matrix4;
import com.game.entities.Entity;

/**
 *
 * @author Vinicius Smith
 */
public class SimpleMapRenderer implements MapRenderer {

    private Map map;
    private SpriteBatch spriteBatch;

    public SimpleMapRenderer(Map map, SpriteBatch spriteBatch) {
        this.map = map;
        this.spriteBatch = spriteBatch;
    }

    @Override
    public void setView(OrthographicCamera camera) {
    }

    @Override
    public void setView(Matrix4 projectionMatrix, float viewboundX, float viewboundsY, float viewboundsWidth, float viewboundsHeight) {
    }

    @Override
    public void render() {
        //TODO: vinny - add functionality to MapLayers allowing a custom value of the layer to be added.
        MapLayers mapLayers = map.getLayers();
        for (MapLayer layer : mapLayers) {
            MapObjects mapObjects = layer.getObjects();
            for (MapObject mapObject : mapObjects) {
                Entity entity = (Entity) mapObject;
                this.spriteBatch.draw(
                        entity.getSprite(), 
                        entity.getSprite().getX(), 
                        entity.getSprite().getY(),
                        entity.getSprite().getWidth(), 
                        entity.getSprite().getHeight());
            }
        }
    }

    @Override
    public void render(int[] layers) {
    }
}
