package com.yener.algoritmadatastructures.algorithm.string;

import java.util.HashMap;

public class FindNoneRepeatingChar {

    public static int findNoneRepeatCharInString(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNoneRepeatCharInString("erhan yener"));
    }
}
