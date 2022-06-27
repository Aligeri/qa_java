package com.example;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception{
        assertEquals(1, new Lion("Самец").getKittens());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    public void doesHaveMane(String arg) throws Exception {
        if ("Самец".equals(arg)) {
            assertTrue(new Lion(arg).doesHaveMane());
        } else assertFalse(new Lion(arg).doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void doesHaveManeWithException() throws Exception {
        new Lion("Сам").doesHaveMane();
        new Lion("123").doesHaveMane();
        new Lion("!!!").doesHaveMane();
        new Lion("   ").doesHaveMane();
    }

    @Test
    public void getFood() throws Exception {
        assertEquals(new Lion("Самец").getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getFoodWithException() throws Exception {
        assertNotEquals(new Lion("Самец").getFood(), List.of("Птицы", "Рыба"));
    }
}