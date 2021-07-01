package com.yener.algoritmadatastructures.algorithm.string;

public class ReverseString {

    public static void reverseByteArray(String text) {
        byte[] strAsByteArray = text.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        System.out.println(new String(result));
    }

    public static void reverseWithStringBuilder(String text){
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        System.out.println(sb.reverse());
    }

    public static void reverseWithChar(String text){
        char[] textAsChar=text.toCharArray();
        for(int i=textAsChar.length-1;i>=0;i--){
            System.out.print(textAsChar[i]);
        }

    }

    public static void main(String[] args) {
        reverseByteArray("Erhan Yener");
        reverseWithStringBuilder("deneme alanı");
        reverseWithChar("Charlı örnek");
    }
}
