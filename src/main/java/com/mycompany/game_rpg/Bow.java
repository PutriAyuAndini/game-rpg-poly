/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_rpg;

/**
 *
 * @author lenovo
 */
public class Bow extends Weapon {
    public Bow(String name, int atk, boolean isBroken, int condition) {
        super(atk, name, isBroken, condition);
    }
    
    @Override
    public void use() {
        super.use();
        System.out.println("Arrow used!");
    }
}