/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.maps.Map;
import com.badlogic.gdx.maps.MapObject;

/**
 *
 * @author Vinicius Smith
 */
public class DungeonMap extends Map {

    public static enum MapType {
        Default
    }

    private MapType mapType;

    public DungeonMap() {
        super();
    }

    public DungeonMap(MapType mapType) {
        this.mapType = mapType;
    }

    /**
     * Adds a given object to the layer chosen by the index value. If the index does contain
     * a layer, the method will create all layers between the last existing layer and the
     * target layer. Index can't be less than 0;
     * @param index layer index
     * @param mapObject object to add to the layer
     */
    public void addObjectToLayer(int index, MapObject mapObject){
        if(index < 0){
            return;
        }
        
        //Check if doesn't exist.
        if (index > this.getLayers().getCount() - 1) {
            //Create necessary layers until target layer
            for (int i = this.getLayers().getCount() - 1; i < index; i++) {
                this.getLayers().add(new DungeonLayer());
            }
        }
        else{
            this.getLayers().get(index).getObjects().add(mapObject);
        }
    }
}
