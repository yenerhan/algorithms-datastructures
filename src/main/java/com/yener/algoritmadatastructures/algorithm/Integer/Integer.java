package com.yener.algoritmadatastructures.algorithm.Integer;

public class Integer {
    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A:" + a + " B:" + b);
    }

    public static void main(String[] args) {
        Long a =1L;
        if(a==1){
            System.out.println("a eşittir 1");
        }

        if(a!=2){
            System.out.println("a eşit değildir 2");
        }
        swapWithoutTemp(3, 2);
    }
}
