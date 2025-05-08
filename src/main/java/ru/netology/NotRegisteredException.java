package ru.netology;

public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Element with id: " + name + " not found");
    }
}
