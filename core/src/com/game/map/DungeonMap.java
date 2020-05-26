/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.map;

import com.badlogic.gdx.maps.Map;

/**
 *
 * @author Vinicius Smith
 */
public class DungeonMap extends Map{
    
    public static enum MapType{
        Default
    }
    
    private MapType mapType;
    
    public DungeonMap(){
        super();
    }
    
    public DungeonMap(MapType mapType){
        this.mapType = mapType;
    }
}
