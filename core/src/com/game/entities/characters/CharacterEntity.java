/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.entities.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.entities.Entity;

/**
 *
 * @author lpela
 */
public class CharacterEntity extends Entity {

    private String job;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private int tempHealth;
    private int tempDamage;
    private int tempDefense;
    private int tempSpeed;

    // Standard Builder
    public CharacterEntity() {
    }

    public CharacterEntity(Sprite sprite) {
        super(sprite);
    }

    public CharacterEntity(Sprite sprite, float x, float y) {
        super(sprite, x, y);
    }

    public CharacterEntity(Texture texture) {
        super(texture);
    }

    public CharacterEntity(Texture texture, float x, float y) {
        super(texture, x, y);
    }

    // CharacterEntity Builder
    public CharacterEntity(String job, int health, int damage, int defense, int speed) {
        this.job = job;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
    }

    public String getJob() {
        return job;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTempHealth() {
        return tempHealth;
    }

    public int getTempDamage() {
        return tempDamage;
    }

    public int getTempDefense() {
        return tempDefense;
    }

    public int getTempSpeed() {
        return tempSpeed;
    }

    public int getTotalDamage() {
        return (tempDamage + damage);
    }

    public int getTotalDefense() {
        return (tempDefense + defense);
    }

    public int getTotalHealth() {
        return (tempHealth + health);
    }

    public int getTotalSpeed() {
        return (tempSpeed + speed);
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTempHealth(int tempHealth) {
        this.tempHealth = tempHealth;
    }

    public void setTempDamage(int tempDamage) {
        this.tempDamage = tempDamage;
    }

    public void setTempDefense(int tempDefense) {
        this.tempDefense = tempDefense;
    }

    public void setTempSpeed(int tempSpeed) {
        this.tempSpeed = tempSpeed;
    }

}
