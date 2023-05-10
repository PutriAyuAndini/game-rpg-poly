/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_rpg;

/**
 *
 * @author lenovo
 */
public class Fighter extends Hero {
    public Fighter(String name, int level, int hp, Weapon weapon) {
        super(name, level, hp, weapon);
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves forward.");
    }

    public void attack() {
        System.out.println(getName() + " attacks!");
    }

    public void attack(String special_Attack) {
        System.out.println(getName() + " performs " + special_Attack + " attack!");
    }

    public void specialAttack() {
        System.out.println(getName() + " performs a devastating special attack!");
    }
}