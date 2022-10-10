package lesson9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {

        String verse = "ABCDE THIS IS MY FAMILY \n"
                + "GHIJ I LOVE THEM EVERY DAY \n"
                + "KLMNO MOTHER, FATHER, BABY, OH \n"
                + "PQRST BROTHER, SISTER, YUO CAN SEE \n"
                + "UVWXYZ ALL THE PEOPLE IN MY FAMILY \n";

        String path = "src/main/resources/verse.txt";

        write(verse, path);
        compare(verse, path);
        System.out.println();
        System.out.println(readFile(path));
    }

    private static void write(String string, String path) {
        try {
            directoryCheck(path);
            try (FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(string);
            }
        } catch (IOException exception) {
            System.err.println("Error with FileWriter");
        }
    }

    private static void directoryCheck(String path) throws IOException {
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
    }

    private static void compare(String input, String path) {
        if (input.equals(readFile(path))) {
            System.out.println("Writing to the file is done");
        }
    }

    private static String readFile(String path) {
        Path pathToFile = Paths.get(path);
        try {
            directoryCheck(path);
            return Files.readString(pathToFile);
        } catch (IOException exception) {
            System.err.println("File read error");
        }
        return null;
    }
}
