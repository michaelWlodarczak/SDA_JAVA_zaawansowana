package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationsApp {
    public static void main(String[] args) {
        Path relativePath = Paths.get("IO.txt");

        System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));

        Path absolutePath = Paths.get("C:\\Users\\Michal\\IdeaProjects\\2021.03.13\\IO.txt");
        System.out.println(absolutePath + " istnieje: " + Files.exists(absolutePath));

        Path path = Paths.get("C", "Windows", "system.ini");
        System.out.println("Zapis do pliku " + path + ":" + Files.isWritable(path));

        Path dyskC = Paths.get("C:\\Users\\Michal");
        try {
            Set<Path> pathSet = Files.list(dyskC).collect(Collectors.toSet());
        } catch (IOException ioe) {
            System.out.println("Wystapil blad IOException" + ioe.toString());
        } finally {
            System.out.println("sprzatam po sobie");
        }

    }
}