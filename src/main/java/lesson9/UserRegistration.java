package lesson9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserRegistration {
    private static String pathToFile = "src/main/resources/users.txt";

    public static String getPathToFile() {
        return pathToFile;
    }

    public static void main(String[] args) {

        registration(pathToFile);

    }

    private static void registration(String path) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a new login");
            String newLogin = scanner.nextLine();
            if (newLogin.isBlank() == true) {
                System.out.println("Login is incorrect");
                return;
            }
            newLogin = newLogin + " ";
            System.out.println("Enter a new password");
            String newPassword = scanner.nextLine();
            if (newPassword.isBlank() == true) {
                System.out.println("Password is incorrect");
                return;
            }
            System.out.println("Repeat the password");
            if (newPassword.equals(scanner.nextLine())) {
                String regData = newLogin.concat(newPassword);
                write(regData + "\n", path);
                System.out.println("Congratulations, a new user has been created");
            } else {
                System.out.println("Passwords do not match. End of program");
            }
        }
    }

    private static void write(String string, String path) {
        directoryCheck(path);
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(string);
        } catch (IOException exception) {
            System.err.println("Error with FileWriter");
        }
    }

    private static void directoryCheck(String path) {
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            try {
                Files.createDirectories(pathToFile.getParent());
            } catch (IOException e) {
                System.err.println("Directory creation error");
            }
        }
    }
}
