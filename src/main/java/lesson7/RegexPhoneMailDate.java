package lesson7;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneMailDate {

    public static void regexNumberPhone(String numberPhone) {
        numberPhone = numberPhone.replaceAll("[\\s\\-\\(\\)]", ""); //удаляем символи пробел, тире, обе скобки
        Pattern pattern = Pattern.compile("^((\\+?3)?8)?0\\d{9}$");
        Matcher matcher = pattern.matcher(numberPhone);
        if (matcher.matches()) {
            System.out.println("Phone number valid: " + numberPhone);
        } else {
            System.out.println("Input phone number in valid format");
        }
    }

    public static void regexMail(String mail) {

        Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
        // \w = A word character: [a-zA-Z_0-9]
        //
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches()) {
            System.out.println("Mail valid: " + mail);
        } else {
            System.out.println("Input mail in valid format");
        }
    }

    public static void regexDate(String date) {

        Pattern pattern = Pattern.compile("^(19|20)[0-9]{2}-[0|1][0-9]-[0-3][0-9]$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            LocalDate stringToDate = LocalDate.parse(date); //строку преобразуем в дату
            if (stringToDate.isBefore(LocalDate.now().plusDays(1))) {   //сравнение полученной дати с текущей+1день
                System.out.println("Date valid: " + date);
            } else {
                System.out.println("Input date should be earlier than current time");
            }
        } else {
            System.out.println("Input date in valid format");
        }
    }
}
