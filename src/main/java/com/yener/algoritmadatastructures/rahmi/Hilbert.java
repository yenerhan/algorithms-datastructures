package com.yener.algoritmadatastructures.rahmi;

public class Hilbert {
    public static void main(String[] args) {
        //4k+1 5,9,13,17
        findAllHilbert(50);
    }

    private static void findAllHilbert(int num) {
        for (int i = 1; i <= num; i++) {
            int temp = i - 1;
            if (temp % 4 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
