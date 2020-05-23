/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.entities.characters;

/**
 *
 * @author lpela
 */
public class Assassin extends Character {
    public Character createAssassin () {
        Character a = new Character ("Assassin", 120, 75, 50, 100);
        return a;
    }
}
