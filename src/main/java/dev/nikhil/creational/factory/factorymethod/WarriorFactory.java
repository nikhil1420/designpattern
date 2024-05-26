package dev.nikhil.creational.factory.factorymethod;

public class WarriorFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name, 100, 10, 5, 5);
    }
}
