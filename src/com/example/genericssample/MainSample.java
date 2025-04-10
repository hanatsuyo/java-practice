package com.example.genericssample;

public class MainSample {
    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("java");
        String element = stack.pop();

        System.out.println(element);
    }
}
