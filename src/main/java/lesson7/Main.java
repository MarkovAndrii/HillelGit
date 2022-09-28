package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input text");
        String string = scan.nextLine();
        System.out.println("Input char array");
        char[] charArray = scan.nextLine().toCharArray();

        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations(string, charArray));
    }
}
