package com.example.sampleanonymous;

public class MainExecute {
    public static void main(String[] args) {
        // 匿名クラス
        SampleInterface sampleInterface = new SampleInterface() {
            public String say(String message) {
                return message;
            }

        };
        String message = sampleInterface.say("Hello");
        System.out.println(message);
    }
    
}
