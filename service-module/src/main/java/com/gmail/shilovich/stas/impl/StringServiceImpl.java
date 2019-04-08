package com.gmail.shilovich.stas.impl;

import com.gmail.shilovich.stas.StringService;
import com.sun.org.apache.xpath.internal.SourceTree;

public class StringServiceImpl implements StringService {

    private static StringServiceImpl instance;

    public static StringServiceImpl getInstance() {
        if (instance == null) {
            instance = new StringServiceImpl();
        }
        return instance;
    }

    @Override
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        numbers = numbers.replaceAll("\\D", ",").trim();
        String[] numberArray = numbers.split(",");
        int sum = 0;
        if (numberArray.length >= 3) {
            return sum;
        }
        for (int i = 0; i < numberArray.length; i++) {
            sum += Integer.parseInt(numberArray[i]);
        }
        return sum;
    }
}
