package com.example.sampleinterface;

public class ImplementSample implements InterfaceSample  {
    private String message;

    public ImplementSample(String message) {
        this.message = message;
    }

    @Override
    public String say() {
        return message + FINAL_INTERFACE;
    }
}
