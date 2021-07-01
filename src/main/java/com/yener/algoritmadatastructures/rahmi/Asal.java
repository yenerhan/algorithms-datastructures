package com.yener.algoritmadatastructures.rahmi;

import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Asal {

    public static void main(String[] args) {
        try {
            File myObj = new File("src/main/resources/text.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                buildNumber(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void buildNumber(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                strBuilder.append(ch);
        }
        findPrimeNumber(strBuilder.toString());
    }

    private static void findPrimeNumber(String primeNumber) {
        if (!StringUtils.isEmpty(primeNumber)) {
            Integer prime = Integer.valueOf(primeNumber);
            int count = 0;
            for (int i = 2; i < prime; i++) {
               if(prime%i==0){
                   count++;
               }
            }
            if(count==0){
                System.out.println(primeNumber);
            }
        }
    }
}
