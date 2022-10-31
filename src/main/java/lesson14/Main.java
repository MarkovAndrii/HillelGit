package lesson14;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //1.1
        Predicate<Double> predicate = (payment) -> payment > 1500.0;
        System.out.println("predicate.test(145.55): " + predicate.test(145.55));    //false
        System.out.println("predicate.test(1500.01): " + predicate.test(1500.01));  //true
        System.out.println();

        //1.2
        Consumer<String> consumer = (string) -> {
            char[] charArray = string.toCharArray();
            for (char c : charArray) {
                System.out.print(c + " ");
            }
        };
        consumer.accept("New charArray 12345!");    //N e w   c h a r A r r a y   1 2 3 4 5 !
        System.out.println();
        System.out.println();

        //1.3
        Function<Integer, String> function = (number) -> inputNumberOutputString(number);
        String functionResult = function.apply(9);
        String functionResult2 = function.apply(-11);
        System.out.println("functionResult: " + functionResult);    //Nine
        System.out.println("functionResult2: " + functionResult2);  //unknown
        System.out.println();

        //1.4
        Supplier<String> supplier = () -> functionResult.toUpperCase();
        System.out.println("supplier.get(): " + supplier.get());    //NINE
        System.out.println();

        //1.5
        BiFunction<Double, Integer, String> biFunction = (doubleBiFunction, integerBiFunction) -> {
            double result = doubleBiFunction - integerBiFunction;
            if (result < 1) {
                return "Result < 1";
            }
            return String.valueOf(result);
        };
        String biFunctionResult = biFunction.apply(25.14, 10);
        String biFunctionResult2 = biFunction.apply(25.14, 100);
        System.out.println("biFunctionResult: " + biFunctionResult);    //15.14
        System.out.println("biFunctionResult2: " + biFunctionResult2);  //Result < 1
        System.out.println();

        //1.6
        FiveDigitFunction<Integer, Double, Float, Long, String> fiveDigitFunction =
                (varInteger, varDouble, varFloat, varLong) -> String.valueOf(varInteger * (varDouble + varFloat - varLong));
        String fiveDigitFunctionResult = fiveDigitFunction.calc(5, 23.5, 300.54F, 150L);
        String fiveDigitFunctionResult2 = fiveDigitFunction.calc(24, 23440.2, 7.02F, 1500L);
        System.out.println("fiveDigitFunctionResult: " + fiveDigitFunctionResult + " end");     //870.2000427246094 end
        System.out.println("fiveDigitFunctionResult2: " + fiveDigitFunctionResult2 + " end");   //526733.2799995423 end
        System.out.println();

        //1.7
        ToLongBiFunction<Short, Integer> toLongBiFunction =
                (varShort, varInteger) -> (long) Math.pow(varInteger, varShort);
        long ToLongBiFunctionResult = toLongBiFunction.applyAsLong((short) 5, 15);
        System.out.println("longResult: " + ToLongBiFunctionResult);    //759375

    }

    private static String inputNumberOutputString(int number) {
        String string = null;
        switch (number) {
            case 1:
                string = "One";
                break;
            case 2:
                string = "Two";
                break;
            case 3:
                string = "Three";
                break;
            case 4:
                string = "Four";
                break;
            case 5:
                string = "Five";
                break;
            case 6:
                string = "Six";
                break;
            case 7:
                string = "Seven";
                break;
            case 8:
                string = "Eight";
                break;
            case 9:
                string = "Nine";
                break;
            case 10:
                string = "Ten";
                break;
            default:
                string = "unknown";
        }
        return string;
    }
}
