/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_rpg;

/**
 *
 * @author lenovo
 */
public class Weapon {
    private int atk;
    private String name;
    private boolean isBroken;
    private int condition;

    public Weapon(int atk, String name, boolean isBroken, int condition) {
        this.atk = atk;
        this.name = name;
        this.isBroken = isBroken;
        this.condition = condition;
    }

    public int getAtk() {
        return atk;
    }

    public String getName() {
        return name;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public int getCondition() {
        return condition;
    }

    public void use() {
        condition--;
        if (condition <= 0) {
            isBroken = true;
        }
        System.out.println(name + " is used! Condition: " + condition);
    }
}