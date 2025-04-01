package com.example.anotation;

public class Anotation {

    String name;

    Anotation(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
