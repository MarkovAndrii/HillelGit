package lesson13;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static Optional<String> check(String string) {
        Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");

        if (string != null && !string.isBlank()) {
            Matcher matcher = pattern.matcher(string);
            if (matcher.matches()) {
                return Optional.of(string);
            }
        }
        return Optional.empty();
    }
}
