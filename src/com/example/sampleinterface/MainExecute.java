package com.example.sampleinterface;

public class MainExecute {
    public static void main(String[] args) {
        ImplementSample sample = new ImplementSample("HELLO");
        System.out.println(sample.say());
    }
}
