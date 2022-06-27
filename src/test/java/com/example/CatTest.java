package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat cat = new Cat(new Feline());

    @Test
    public void getSound() {
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    public void getFood() throws Exception {
        List<String> actualFoodList = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actualFoodList);
    }
}