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

        System.out.println();
        System.out.println("Input number phone(Ukrainian format)");
        RegexPhoneMailDate.regexNumberPhone(scan.nextLine());

        System.out.println();
        System.out.println("Input your mail");
        RegexPhoneMailDate.regexMail(scan.nextLine());

        System.out.println();
        System.out.println("Input your date of Birth"); // YYYY-MM-DD
        RegexPhoneMailDate.regexDate(scan.nextLine());

        //TESTS
        /*System.out.println("Result of method stringOperations: "+StringHelper.stringOperations("string", null));
        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations("", new char[0]));
        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations("string", new char[0]));
        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations("string", new char[]{' ','\t'}));
        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations(" string ", new char[]{' ','e','4','\t'}));
        System.out.println("Result of method stringOperations: "+StringHelper.stringOperations(" strng ", new char[]{' ','e','4','\t'}));

        RegexPhoneMailDate.regexNumberPhone("+380671234567");
        RegexPhoneMailDate.regexNumberPhone("380671234567");
        RegexPhoneMailDate.regexNumberPhone("80671234567");
        RegexPhoneMailDate.regexNumberPhone("0671234567");
        RegexPhoneMailDate.regexNumberPhone("+38 (067) 123-45-67");
        RegexPhoneMailDate.regexNumberPhone("+38(067) 123-45-67");
        RegexPhoneMailDate.regexNumberPhone("+38-067-123-45-67");
        RegexPhoneMailDate.regexNumberPhone("+380 (67) 123-45-67");
        RegexPhoneMailDate.regexNumberPhone("+380 67 123-4-567");

        RegexPhoneMailDate.regexMail("user@mail.ua");
        RegexPhoneMailDate.regexMail("user@mail.com");
        RegexPhoneMailDate.regexMail("us-er@mail.ua");
        RegexPhoneMailDate.regexMail("user.@mail.ua");
        RegexPhoneMailDate.regexMail("user@mail.u");
        RegexPhoneMailDate.regexMail("usermail.ua");
        RegexPhoneMailDate.regexMail(" @mail.ua");
        RegexPhoneMailDate.regexMail("us...er@mail.ua");
        RegexPhoneMailDate.regexMail("user@mailua");
        RegexPhoneMailDate.regexMail("user@mail-ua");
        RegexPhoneMailDate.regexMail("user@mail..ua");
        RegexPhoneMailDate.regexMail("user@mail.UA");
*/
        // YYYY-MM-DD
        /*RegexPhoneMailDate.regexDate("12-01-2000");
        RegexPhoneMailDate.regexDate("12/01/2000");
        RegexPhoneMailDate.regexDate("12.01.2000");
        RegexPhoneMailDate.regexDate("1799-03-03");
        RegexPhoneMailDate.regexDate("2023-01-12");
        RegexPhoneMailDate.regexDate("2000-01-12");
        RegexPhoneMailDate.regexDate("2000-99-55");
        RegexPhoneMailDate.regexDate("2022-09-28");
        RegexPhoneMailDate.regexDate("2022-09-30");
        RegexPhoneMailDate.regexDate("2022-10-01");*/

    }
}
