package com.example.type;

public class WrapperClass {
    public static void main(String[] args) {
        Integer num01 = Integer.valueOf(10);
        
        Integer num02 = Integer.valueOf("10");

        Integer num03 = Integer.valueOf("10", 2);
        
        int num04 = Integer.parseInt("10");
        int num05 = Integer.parseInt("11", 2);
        
        String num06 = Integer.toString(10);
        String num07 = num01.toString();
    }
}
