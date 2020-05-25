/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dungeoncrawler;

/**
 *
 * @author lpela
 */
public class Character {
    private String job;
    private int health;
    private int damage;
    private int defense;
    private int tempHealth;
    private int tempDamage;
    private int tempDefense;

    
    // Standard Builder
    public Character (){}
    
    // Character Builder
    public Character (String job, int health, int damage, int defense) {this.job = job; this.health = health; this.damage = damage; this.defense = defense;}
    
    // Assassin Builder
    public Character createAssassin () {
        Character a = new Character ("Assassin", 120, 75, 50);
        return a;
    }
    
    // Mage Builder
    public Character createMage () {
        Character a = new Character ("Mage", 100, 100, 50);
        return a;
    }
    
    // Warrior Builder
    public Character createWarrior () {
        Character a = new Character ("Warrior", 150, 50, 100);
        return a;
    }
    
    public String getJob () {return job;}
    public int getHealth () {return health;}
    public int getDamage () {return damage;}
    public int getDefense () {return defense;}
    
    public void setJob (String job) {this.job = job;}
    public void setHealth (int health) {this.health = health;}
    public void setDamage (int damage) {this.damage = damage;}
    public void setDefense (int defense) {this.defense = defense;}
    
    public void dmgTaken (int a) {
        
    }
    
    public void healingDone (int a) {    
        
    }
    
    public void armourBuff (int a) {
        
    }
    
}
