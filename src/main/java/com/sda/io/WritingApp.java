package com.sda.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingApp {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("IO.txt");

        Writer writer = new FileWriter(path.toFile(), true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Nowy tekst");
        bufferedWriter.newLine();
        bufferedWriter.write("Java Java Java");
        bufferedWriter.close();

    }
}
