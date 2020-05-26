/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.utils.Array;
import java.util.Iterator;

/**
 *
 * @author Vinicius Smith
 */
public class DungeonLayer extends MapLayer {

    public DungeonLayer() {
        super();
    }

    public void addAll(Iterator<MapObject> mapObjects) {
        while (mapObjects.hasNext()) {
            this.getObjects().add(mapObjects.next());
        }
    }

    public void addAll(Array<MapObject> mapObjects) {
        Iterator<MapObject> iterator = mapObjects.iterator();
        while (iterator.hasNext()) {
            this.getObjects().add(iterator.next());
        }
    }
}
