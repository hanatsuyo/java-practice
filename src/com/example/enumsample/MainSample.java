package com.example.enumsample;

public class MainSample {
    public static void main(String[] args) {
        DaySample day = new DaySample(Day.MONDAY);
        Day today = day.getToday();
        switch (today) {
            case MONDAY :
                System.out.println("月曜日です");
                break;
            default:
                throw new AssertionError();
        }
    }   
}
