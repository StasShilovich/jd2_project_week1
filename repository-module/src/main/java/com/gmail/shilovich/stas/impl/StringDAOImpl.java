package com.gmail.shilovich.stas.impl;

import com.gmail.shilovich.stas.StringDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringDAOImpl implements StringDAO {

    private static StringDAOImpl instance;

    public static StringDAOImpl getInstance() {
        if (instance == null) {
            instance = new StringDAOImpl();
        }
        return instance;
    }

    @Override
    public List<String> getStringList(String fileName) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while (line!=null) {
                stringList.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return stringList;
    }
}
