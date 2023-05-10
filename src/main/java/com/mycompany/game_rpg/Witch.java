/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game_rpg;

import java.util.Random;

/**
 *
 * @author lenovo
 */
public class Witch extends Enemy {
    public Witch(String name, int level, int hp, Weapon weapon) {
        super(name, level, hp, weapon);
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves randomly.");
        Random rand = new Random();
        int direction = rand.nextInt(4);
        int step = rand.nextInt(5) + 1;

        switch (direction) {
            case 0:
                System.out.println(getName() + " moves " + step + " steps to the north.");
                move(0, step);
                break;
            case 1:
                System.out.println(getName() + " moves " + step + " steps to the south.");
                move(0, -step);
                break;
            case 2:
                System.out.println(getName() + " moves " + step + " steps to the east.");
                move(step, 0);
                break;
            case 3:
                System.out.println(getName() + " moves " + step + " steps to the west.");
                move(-step, 0);
                break;
        }
    }
    private void move(int x, int y) {
    System.out.println(getName() + " moves " + x + " steps to the east and " + y + " steps to the south.");
    }
}