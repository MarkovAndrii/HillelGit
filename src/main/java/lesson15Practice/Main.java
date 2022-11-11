package lesson15Practice;

import lesson15Practice.entity.Car;
import lesson15Practice.entity.Vehicle;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //Java9

        //Literals - Immutable collections
        List<String> stringList = List.of("blue", "yellow", "green", "white");
        List<String> stringListMutable = new ArrayList<>(List.of("blue", "yellow", "green", "white"));
        List<Object> objectList = List.of("black", 48, new Vehicle());
        Set<Integer> integerSet = Set.of(5, 15, 20);
        Map<Integer, String> integerStringMap = Map.of(1, "First", 2, "Second", 3, "Third");
        Map<Integer, String> integerStringMapMutable = new java.util.HashMap<>(Map.of(1, "First", 2, "Second", 3, "Third"));

//        stringList.add("red");    // Not add to Immutable collections
        stringListMutable.add(0, "red"); //add to Mutable collections
        System.out.println("stringListMutable: " + stringListMutable);

//        integerStringMap.put(4,"Fourth"); // Not add to Immutable collections
        integerStringMapMutable.put(4, "Fourth");
        System.out.println("integerStringMapMutable: " + integerStringMapMutable);

        //Elvis operator ?:
        Vehicle car = new Vehicle();
        String name = car.getName() == null ? null : car.getName();

//        Integer var = null;
//        Integer checkedVar = Objects.requireNonNullElse(var, 45);   //checked var == null
//        if (var == null) {
//            var = 45;   //default value
//        }
//        System.out.println("checkedVar: " + checkedVar);

        //Java10

//        var value = "Java"; // var - variable type(String or int or...)
        // the next two lines are identical
//        JFormattedTextField jFormattedTextField = new JFormattedTextField();
//        var jFormattedTextFieldVar = new JFormattedTextField();

        //Java11

        //var for Lambda
        Function<String, String> function = (String var) -> var.concat("day");  //String var
        String functionResult = function.apply("Good ");
        System.out.println("functionResult: " + functionResult);
        Function<String, String> function2 = (var) -> var.concat("day");    //var
        String functionResult2 = function2.apply("Good ");
        System.out.println("functionResult2: " + functionResult2);
        Function<String, String> function3 = (var var) -> var.concat("day");    //var var
        String functionResult3 = function3.apply("Good ");
        System.out.println("functionResult3: " + functionResult3);

        //String methods improved
        System.out.println(functionResult.repeat(5)); //repeat String

        Optional<String> stringOptional = "word".describeConstable();   //Java12
        System.out.println(stringOptional);

        //Java12

        //switch-case new (with Lambda)
        String str = "five";
        switch (str) {
            case "five" -> System.out.println("Next value");
            case "ten" -> System.out.println("Last value");
        }

        //Java13

        //switch with yield
        int number = 1;
        String result = switch (number) {   //switch is identical to each other
            case 1:
                yield "One"; //return result of switch
            case 2:
                yield "Two";
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        };

        //switch with Lambda
        String result2 = switch (number) {  //switch is identical to each other
            case 1 -> "One"; //return result of switch
            case 2 -> "Two";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };

        //Text blocks(preview to v15)
        String text = """
                Text block \
                continue...
                next line
                """;
        System.out.println(text);

        //Java14

        //Records(preview to v16)
        Record checkingPort = new Record("checking port", 15);
        System.out.println(checkingPort.setting() + " " + checkingPort.value());

        //instanceOf(preview to v15)
//        if(car instanceof Car){   //before
//            ((Car)car).getName();
//        }
        if (car instanceof Car newCar) {    //after
            newCar.getName();
        }

        //Java 15

        //sealed classes&interfaces
        //explanation in the folder "entity"
    }
}
