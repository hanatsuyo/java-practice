package com.example.samplecompare;

public class MainSample {
    public static void main(String[] args) {
        Object obj = new FooService("Hello");

        System.out.println(obj instanceof FooService);
        System.out.println(obj instanceof AbstractBaseService);
        System.out.println(obj instanceof BaseService);

        if (obj instanceof FooService) {
            FooService service = (FooService) obj;
            System.out.println(service.say());
        }
    }
}
