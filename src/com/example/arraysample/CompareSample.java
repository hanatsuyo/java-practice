package com.example.arraysample;

import java.util.Arrays;
import java.util.Comparator;

public class CompareSample {

    // オブジェクト同士のソートを行う場合にはComparatorインターフェースをimportして、compareメソッドをオーバーライドする必要がある。
    public static void main(String[] args) {
        Integer[] array = { 3, 1, 13, 2, 8, 5, 1 };
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Arrays.sort(array, c);
        System.out.println(Arrays.toString(array));
    }
}
