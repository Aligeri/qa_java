package com.example;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        assertEquals(new Feline().eatMeat(),
                List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, new Feline().getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 55, 84, 123})
    public void testGetKittens(int args) {
        assertEquals(args, new Feline().getKittens(args));
    }
}