package com.yener.algoritmadatastructures.algorithm;

import com.yener.algoritmadatastructures.algorithm.interview.UniqueCharacter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharacterTest {

    private UniqueCharacter uniqueCharacter;

    @Before
    public void setUp() {
        uniqueCharacter = new UniqueCharacter();
    }

    @Test
    public void testUniqueCharacter(){
        Assert.assertFalse(uniqueCharacter.checkUnique("Deneme"));
        Assert.assertTrue(uniqueCharacter.checkUnique("de"));
        Assert.assertFalse(uniqueCharacter.checkUniqueType2("ee"));
    }
}