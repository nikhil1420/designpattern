package dev.nikhil.creational.factory.factorymethod;

public class MageFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        return new Mage(name, 50, 5, 5, 10);
    }
}
