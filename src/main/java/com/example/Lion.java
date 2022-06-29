package com.example;

import java.util.List;

public class Lion {

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    boolean hasMane;

    Feline feline = new Feline();

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}