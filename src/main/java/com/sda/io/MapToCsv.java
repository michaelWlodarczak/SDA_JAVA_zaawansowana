package com.sda.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapToCsv {
    public static void main(String[] args) {
        Map<String, String> values = new HashMap<>();
        values.put("Michal", "Wlodarczak");
        values.put("Jakub", "Karski");
        values.put("Radoslaw", "Genderka");

        Path path = Paths.get("mapa.scv");

        writeTOFile(path, values);
    }

    public static void writeTOFile(Path path, Map<String, String> values) {
        try {
            BufferedWriter writter = Files.newBufferedWriter(path);
            for (String name : values.keySet()) {
                String lastName = values.get(name);
                writter.write(name + "," + lastName);
                writter.newLine();
            }
            writter.close();

        } catch (IOException exception) {
            System.out.println("Bład");
        }
    }
}
