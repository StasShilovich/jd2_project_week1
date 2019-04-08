package com.gmail.shilovich.stas.impl;

import com.gmail.shilovich.stas.FileService;
import com.gmail.shilovich.stas.StringDAO;
import com.gmail.shilovich.stas.StringService;

import java.util.List;

public class FileServiceImpl implements FileService {
    private static FileServiceImpl instance;

    public static FileServiceImpl getInstance() {
        if (instance == null) {
            instance = new FileServiceImpl();
        }
        return instance;
    }

    @Override
    public String getSumOfEachString(String filename) {
        StringDAO stringDAO = StringDAOImpl.getInstance();
        StringService stringService = StringServiceImpl.getInstance();
        List<String> list = stringDAO.getStringList(filename);
        String rezult = "";
        for (String line : list) {
            rezult += stringService.add(line);
        }
        return rezult;
    }
}
