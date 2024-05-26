package dev.nikhil.creational.factory.factorymethod;

public class App {
    public static void main(String[] args) {

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();

        Character warrior = warriorFactory.createCharacter("Thor");
        Character mage = mageFactory.createCharacter("Gandalf");

        warrior.display();
        warrior.attack();
        mage.display();
        mage.attack();

    }
}
