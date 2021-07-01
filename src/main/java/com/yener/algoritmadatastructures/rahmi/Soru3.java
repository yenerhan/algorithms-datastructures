package com.yener.algoritmadatastructures.rahmi;

public class Soru3 {

    public static void main(String[] args) {
        write(60);
    }

    private static void write(int num) {
        for (int i = num; i > 0; i--) {
            if(i==num){
                continue;
            }
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
