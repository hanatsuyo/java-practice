package com.example.todo;

public class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;

    void setScore(int newScore) {
        score = newScore;
        System.out.println(newScore);
    }

    void printScore() {
        System.out.println(score);
    }
}