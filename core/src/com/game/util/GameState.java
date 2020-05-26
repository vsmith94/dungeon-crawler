/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.util;

import com.badlogic.gdx.maps.Map;

/**
 *
 * @author Vinicius Smith
 */
public abstract class GameState {
    
    private static Map currentMap;
    
    public static Map getMap(){
        return currentMap;
    }
    public static void setMap(Map newMap){
        GameState.currentMap = newMap;
    }
}
