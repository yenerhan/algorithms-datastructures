package com.yener.algoritmadatastructures.algorithm.string;

import java.util.regex.Pattern;

public class ReverseWords {

    private static void reverseWords(String text) {
        Pattern pattern = Pattern.compile("\\s");
        String[] temp = pattern.split(text);
        String[] temp2 = text.split(" ");
        for (int i = temp.length - 1;i>=0;i--) {
            System.out.print(temp[i]);
        }
    }

    public static void main(String[] args) {
        reverseWords("Bu bir denemedir.");
    }
}
