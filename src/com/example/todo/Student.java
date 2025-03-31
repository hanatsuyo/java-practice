package com.example.todo;

public class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;

    Student(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

    void printScore() {
        System.out.println(this.name + "さんの点数は" + this.score);
    }
}