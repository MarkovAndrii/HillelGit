package lesson7;

public class StringHelper {

    public static String stringOperations(String string, char[] charArray) {
        String stringResult = null;
        if (String.copyValueOf(charArray).isEmpty()) {  //проверка массива символов на null
            System.out.println("Array is null");
        } else {
            String stringOfArray = String.copyValueOf(charArray);
            if (string.isBlank() || stringOfArray.isBlank()) {  //проверка двух строк на пустоту
                System.out.println("One of string is null");
            } else {
                String stringUp = string.toUpperCase().strip() + " ";
                String stringLow = stringOfArray.toLowerCase().strip();
                String stringConcat = stringUp.concat(stringLow);   //конкатенация строк
                int lengthString = stringConcat.length();
                if (lengthString % 2 == 0) {    //вирезаем центральние символи в зависимости чет/нечет
                    stringResult = stringConcat.substring(lengthString / 2 - 1, lengthString / 2 + 1);
                } else {
                    stringResult = stringConcat.substring(lengthString / 2, lengthString / 2 + 1);
                }
            }
        }
        return stringResult;
    }
}
