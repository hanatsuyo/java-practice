package com.example.type;

public class WideningNarrowing {
    public static void main(String... args) {
        short shortA = 1;
        int intA = shortA; // ワイドニング

        int intB = 1;

        short shortB = (short) intB; // ナローイング

        System.out.println(intA);
        System.out.println(shortB);
    }
}
