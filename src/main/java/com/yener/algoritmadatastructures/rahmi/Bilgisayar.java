package com.yener.algoritmadatastructures.rahmi;

public class Bilgisayar {

    public static void main(String[] args) {
        String text = "Bilgisayar";
        for (int i = 0; i <= text.length(); i++) {
            System.out.println(text.substring(0, i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
