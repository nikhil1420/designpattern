package dev.nikhil.creational.prototypeandregistry;

public interface Prototype<T> {
    Prototype<T> clone();
}
