package lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String pathToFile = UserRegistration.getPathToFile();

        login(pathToFile);

    }

    private static void login(String path) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 3; i >= 0; i--) {
                System.out.println("Enter your login");
                String userLogin = scanner.nextLine() + " ";
                System.out.println("Enter your password");
                String userPassword = scanner.nextLine();
                String userData = userLogin.concat(userPassword);
                String user = compare(userData, path);
                if (user != null) {
                    System.out.println("Welcome to the program");
                    return;
                } else {
                    if (i != 0) {
                        System.out.println("The data is incorrect. Enter the data again, you have " + i + " attempts left");
                    }
                }
            }
            System.out.println("Try again later. The program is closed");
        }
    }

    private static String compare(String input, String path) {
        List<String> allUsers = readList(path);
        String user = findUser(input, allUsers);
        return user;
    }

    private static String findUser(String input, List<String> allUsers) {
        for (String user : allUsers) {
            if (input.equals(user)) {
                return user;
            }
        }
        return null;
    }

    private static List<String> readList(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.err.println("Error compare contents");
        }
        return null;
    }
}
