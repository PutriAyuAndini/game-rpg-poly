/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_rpg;

/**
 *
 * @author lenovo
 */
public class Character {
    private String name;
    private int level;
    private int hp;
    private Weapon weapon;

    public Character(String name, int level, int hp, Weapon weapon) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() + " with " + weapon.getName() + "!");
        target.takeDamage(weapon.getAtk());
    }

    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println(name + " takes " + damage + " damage!");
        if (hp <= 0) {
            die();
        }
    }

    public void die() {
        System.out.println(name + " has died!");
    }

    public void move() {
        System.out.println(name + " moves.");
    }

    public void attack() {
        System.out.println(name + " attack");
    }
}