/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.game_rpg;

/**
 *
 * @author lenovo
 */
public class App {
    public static void main(String[] args) {
    // Static polymorphism pada class Hero dan Enemy
    Hero hero = new Hero("Hiroto", 1, 100, new Sword("Excalibur", 20, false, 160));
    hero.move();
    hero.attack();
    hero.attack("Special Attack");

    Enemy enemy = new Enemy("Kuryu", 1, 50, new Bow("Longbow", 10, false, 200));
    enemy.move();
    enemy.attack();
    enemy.attack("Special Attack");

    // Dynamic polymorphism sebuah referensi dari class Character ke objek Hero, Enemy, Witch, dan Fighter
    Character character1 = new Hero("Yuki", 2, 150, new Sword("Mjolnir", 25, false, 160));
    character1.move();
    character1.attack();

    Character character2 = new Enemy("Taejo", 2, 75, new Bow("Crossbow", 15, false, 200));
    character2.move();
    character2.attack();

    Character character3 = new Witch("Yuta", 3, 80, null);
    character3.move();
    character3.attack();

    Character character4 = new Fighter("Tanjiro", 4, 200, new Sword("Katana", 30, false, 160));
    character4.move();
    character4.attack();

    // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang di-cast menjadi objek Fighter
    Character character5 = new Witch("Jaekyung", 5, 90, new Bow("Shortbow", 12, false, 200));
    if (character5 instanceof Fighter) {
        Fighter fighter = (Fighter) character5;
        fighter.move();
        fighter.specialAttack();
    }
    }
}