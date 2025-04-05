package com.example.sampleclass;

public class ExecuteClass {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        String res = sample.action();
        

        System.out.println(StaticClass.staticField);
        StaticClass.changeField("Japan");
        StaticClass.show();

    }
}
