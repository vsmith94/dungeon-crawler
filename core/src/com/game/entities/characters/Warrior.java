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
public class Warrior extends Character {
    public Character createWarrior () {
        Character a = new Character ("Warrior", 150, 50, 100, 100);
        return a;
    }
}