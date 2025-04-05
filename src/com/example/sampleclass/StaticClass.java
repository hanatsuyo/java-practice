package com.example.sampleclass;

public class StaticClass {
    static String staticField = "World";


    static String staticMethod() {
        return staticField;
    }

    static void changeField(String country) {
        staticField = country;
    }

    static void show() {
        System.out.println(staticMethod());
    }
}
