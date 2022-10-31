package lesson14;

import java.util.HashMap;
import java.util.function.Function;

//1.3 Function: метод, который на вход принимает целое число от 1 до 10,
// а возвращает строку в соответствии этому числу, только словом.
// Например: 3 -> “three”. Если число вне диапазона, то возвращать слово “unknown”;

public class Task13Alternative {
    private static HashMap<Integer, String> numberString = new HashMap<>();

    static {
        numberString.put(1, "One");
        numberString.put(2, "Two");
        numberString.put(3, "Three");
        numberString.put(4, "Four");
        numberString.put(5, "Five");
        numberString.put(6, "Six");
        numberString.put(7, "Seven");
        numberString.put(8, "Eight");
        numberString.put(9, "Nine");
        numberString.put(10, "Ten");
    }

    public static void main(String[] args) {

        Function<Integer, String> function = (number) -> inOut(number);
        String functionResult = function.apply(9);
        String functionResult2 = function.apply(-11);
        System.out.println("functionResult: " + functionResult);    //Nine
        System.out.println("functionResult2: " + functionResult2);  //unknown

    }

    private static String inOut(int number) {
        if (numberString.containsKey(number)) {
            return numberString.get(number);
        }
        return "unknown";
    }
}
