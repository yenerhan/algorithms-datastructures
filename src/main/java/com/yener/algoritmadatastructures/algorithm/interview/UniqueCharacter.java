package com.yener.algoritmadatastructures.algorithm.interview;

import java.util.HashSet;

public class UniqueCharacter {

    public boolean checkUnique(String text) {
        if (text.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < text.length(); i++) {
            int val = text.charAt(i); // char can be int
            if (char_set[val]) { // Already found
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean checkUniqueType2(String text){
        char[] stringAsByteAray=text.toCharArray();
        HashSet<Character> result=new HashSet<>();
        for (char b : stringAsByteAray) {
            if(result.contains(b)){
                return false;
            }else {
                result.add(b);
            }
        }
        return true;
    }
}
