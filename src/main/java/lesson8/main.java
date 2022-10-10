package lesson8;

import lesson8.entity.Client;
import lesson8.service.TransactionService;
import lesson8.util.CheckParameters;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sender = selectClientAccountId(scan, "Sender");
        String recipient = selectClientAccountId(scan, "Recipient");
        transferAmount(scan);

        Client client = new Client();
        client.setClientAccountId(sender);
        TransactionService.sendMoney(client, recipient);
        System.out.println("The transfer amount is done");
    }

    public static String selectClientAccountId(Scanner scan, String typeClient) {
        while (true) {
            System.out.println("Enter the " + typeClient + " Customer Account ID");
            String clientAccountId = scan.nextLine();
            try {
                CheckParameters.compareLengthClientAccountId(clientAccountId);
                System.out.println(typeClient + " Customer Account ID is valid");
                return clientAccountId;
            } catch (IOException e) {
                System.out.println("Catch IOException - " + typeClient + " Customer Account ID length is not 10");
            }
        }
    }

    public static double transferAmount(Scanner scan) {
        while (true) {
            System.out.println("Enter the transfer amount");
            String sumString = scan.nextLine();
            try {
                double sum = Double.parseDouble(sumString);
                CheckParameters.compareSum(sum);
                System.out.println("The transfer amount is valid");
                return sum;
            } catch (NoSuchFieldException e) {
                System.out.println("Catch NoSuchFieldException - The amount is more than 1000");
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Please enter sum in rightly format");
            }
        }
    }
}