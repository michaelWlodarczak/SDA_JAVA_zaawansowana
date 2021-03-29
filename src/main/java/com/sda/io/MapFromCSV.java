package com.sda.io;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapFromCSV {
    public static void main(String[] args) {
        Path path = Paths.get("mapa.csv");

       // Map<String,String> loaded = readFromFile(path);
      //  System.out.println(loaded);

    }
/*
    private static Map<String,String> readFromFile (Path path) {
        Map<String, String> loadedData = new HashMap<>();

        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while (line != null){
                String[]
            }
        }

        // TODO zaladuj dane z pliku do loadedData
        return new HashMap<>(); */
    }
}
