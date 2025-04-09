package com.example.samplecompare;

public class FooService extends AbstractBaseService {
    
    public FooService(String name) {
        super(name);
    }

    public String say() {
        return "Hello";
    }
}
