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
public class Mage extends Character {
    public Character createMage () {
        Character a = new Character ("Mage", 100, 100, 50, 100);
        return a;
    }
}
