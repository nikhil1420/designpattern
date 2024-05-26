package dev.nikhil.creational.factory.factorymethod;

public abstract class Character {
        protected String name;
        protected int health;
        protected int strength;
        protected int agility;
        protected int intelligence;
        public Character(String name, int health, int strength, int agility, int
                intelligence) {
            this.name = name;
            this.health = health;
            this.strength = strength;
            this.agility = agility;
            this.intelligence = intelligence;
        }
        public abstract void display();
        public abstract void attack();

    }
